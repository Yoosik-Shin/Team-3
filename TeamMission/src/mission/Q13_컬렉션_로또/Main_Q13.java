package mission.Q13_컬렉션_로또;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

// ‘김조은’씨는 로또 판매점에 가서 로또를 구매합니다.
// 로또는 한 장에 최대 5개의 게임을 선택할 수 있으며,
// (자동),(수동) 방식으로 1 ~ 45 사이의 숫자 중에서 6개의 번호를 지정할 수 있 습니다.
// <실행결과>와 같이 구매한 로또 용지를 출력하고 당첨 결과도 확인할 수 있는 프로그램을 작성해보세요.
// 몇게임? 5
// [1 게임] (1.자동/ 2.수동) : 1
// 4 10 14 17 43 45
// [2 게임] (1.자동/ 2.수동) : 1
// 1 12 34 40 41 42
// [3 게임] (1.자동/ 2.수동) : 1
// 16 18 19 21 26 32
// [4 게임] (1.자동/ 2.수동) : 1
// 7 17 20 30 43 45
// [5 게임] (1.자동/ 2.수동) : 2
// ①: 10
// ②: 22
// ③: 27
// ④: 33
// ⑤: 40
// ⑥: 44
// 10 22 27 33 40 44

public class Main_Q13 {

	public static void main(String[] args) {
		Main_Q13       game      = new Main_Q13();
		List<UserGame> userGames = game.inputGames();
		game.printResult(userGames);
	}

	public List<UserGame> inputGames() {
		List<UserGame> userGames = new ArrayList<>();
		Scanner        sc        = new Scanner(System.in);

		System.out.print("몇게임? ");
		int maxGame   = sc.nextInt();
		int gameCount = 0;

		while (gameCount < maxGame) {
			System.out.print("[" + (gameCount + 1) + " 게임] (1.자동/ 2.수동) : ");
			int mode = sc.nextInt();

			switch (mode) {
				case 1 :
					// 자동
					Set<Integer> autoGame = new HashSet<>();
					Random rand = new Random();
					while (autoGame.size() < 6) {
						autoGame.add(rand.nextInt(45) + 1);
					}
					userGames.add(new UserGame(autoGame, "자동"));
					System.out.println(formatSet(autoGame));
					gameCount++;
					break;
				case 2 :
					// 수동
					Set<Integer> game = new HashSet<>();
					System.out.print("① : ");
					game.add(sc.nextInt());
					System.out.print("② : ");
					game.add(sc.nextInt());
					System.out.print("③ : ");
					game.add(sc.nextInt());
					System.out.print("④ : ");
					game.add(sc.nextInt());
					System.out.print("⑤ : ");
					game.add(sc.nextInt());
					System.out.print("⑥ : ");
					game.add(sc.nextInt());
					System.out.println(formatSet(game));

					userGames.add(new UserGame(game, "수동"));
					gameCount++;

					break;

				default :
					System.out.println("1 또는 2 중에서 선택해주세요.");
					break;
			}

		}
		sc.nextLine();
		sc.close();
		return userGames;
	}

	public void printResult(List<UserGame> userGames) {
		LottoManager     manager        = LottoManager.getInstance();
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss", Locale.KOREAN);
		SimpleDateFormat dateFormat     = new SimpleDateFormat("yyyy/MM/dd");

		System.out.println("################ 인생역전Lottoria #################");
		System.out.println("발행일 : " + dateTimeFormat.format(manager.getIssueDate()));
		System.out.println("추첨일 : " + dateTimeFormat.format(manager.getDrawDate()));
		System.out.println("지급기한 : " + dateFormat.format(manager.getLastDate()));
		System.out.println("------------------------------------------------");

		char num = 'A';
		for (int i = 0; i < userGames.size(); i++) {
			UserGame     userGame = userGames.get(i);
			Set<Integer> inputNum = userGame.getNumbers();
			String       type     = userGame.getType();

			Set<Integer> copyNum = new HashSet<>(inputNum);
			// copy에서 randomNum에 존재하지 않는 요소들을 제거
			copyNum.retainAll(manager.getRandomNum());
			int matchCount = copyNum.size();
			// user에서 보너스 번호 있는지 확인
			boolean hasBonus = inputNum.contains(manager.getBonusNum());

			if (matchCount == 6) {
				userGame.setRank("1등");
			} else if (matchCount == 5 && hasBonus) {
				userGame.setRank("2등");
			} else if (matchCount == 5) {
				userGame.setRank("3등");
			} else if (matchCount == 4) {
				userGame.setRank("4등");
			} else if (matchCount == 3) {
				userGame.setRank("5등");
			} else {
				userGame.setRank("낙첨");
			}

			System.out.println(num++ + " " + type + " " + formatSet(inputNum));
		}
		System.out.println("------------------------------------------------");
		System.out.println("금액 ₩" + userGames.size() + ",000");
		System.out.println("################################################");
		System.out.println("당첨번호 : " + formatSet(manager.getRandomNum()));
		System.out.println("보너스번호 : " + manager.getBonusNum());
		System.out.println("#################### 당첨결과 #####################");

		num = 'A';
		for (UserGame userGame : userGames) {
			Set<Integer> user = userGame.getNumbers();
			String       type = userGame.getType();
			String       rank = userGame.getRank();

			System.out.println(num++ + type + " " + formatSet(user) + " (" + rank + ")");
		}
		System.out.println("################################################");
	}

	private String formatSet(Set<Integer> set) {
		List<Integer> sorted = new ArrayList<>(set);
		Collections.sort(sorted);
		StringBuilder sb = new StringBuilder();
		for (int n : sorted) {
			sb.append(("00" + n).substring(("00" + n).length() - 2)).append(" ");
		}
		return sb.toString().trim();
	}

}
// - 당첨 등수는 당첨 번호와 게임당 선택번호가 일치하는 개수로 정한다.
// 6개일치하면1등,
// 5개일치하고보너스번호가일치하면2등,
// 5개만일치하면3등,
// 4개일치하면4등,
// 3개일치하면5등
// ############## 인생역전Lottoria ##############
// 발행일: 2021/06/12일(토) 05:01:58
// 추첨일: 2021/06/12일(토) 21:00:00
// 지급기한: 2022/06/13일(월)
// -------------------------------------------
// A 자동04 10 14 17 43 45
// B 자동01 12 34 40 41 42
// C 자동16 18 19 21 26 32
// D 자동07 17 20 30 43 45
// E 수동10 22 27 33 40 44
// -------------------------------------------
// 금액 ₩5,000
// ###########################################
// 당첨번호: 14 19 24 29 36 42
// 보너스번호: 45
// #################### 당첨결과#################
// A 자동04 10 14 17 43 45 (낙첨)
// B 자동01 12 34 40 41 42 (낙첨)
// C 자동16 18 19 21 26 32 (낙첨)
// D 자동07 17 20 30 43 45 (낙첨)
// E 수동10 22 27 33 40 44 (낙첨)
// ###########################################
