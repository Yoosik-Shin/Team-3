package mission.Q13_컬렉션_로또;

// <조건>
// - ArrayList 를 이용하시오
// - 싱글톤 패턴을 적용하시오.
// - 발행일은 현재 시간으로 지정하며 추첨일은 토요일 오후 9시를 기준으로,
// 이전이면 그 주 토요일 9시로 이후이면 차주 토요일 오후 9시로 지정하시오.
// - 지급 기한은 1년하고 1일을 더한 날짜로 지정하시오.

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoManager {
	private static LottoManager instance  = null;
	private final Set<Integer>  randomNum = new HashSet<>(); // 랜덤 번호
	private int                 bonusNum;	// 보너스 번호
	private final Date          issueDate;	// 발행일
	private final Date          drawDate;	// 추첨일
	private final Date          lastDate;	// 지급기한

	private LottoManager() {
		this.issueDate = new Date();
		this.drawDate  = getDrawDate(issueDate);
		this.lastDate  = getLastDate(drawDate);
		setLottoNumber();
	}

	public static LottoManager getInstance() {
		if (instance == null) {
			instance = new LottoManager();
		}
		return instance;
	}

	/**
	 * 당첨 번호 추첨
	 */
	private void setLottoNumber() {
		Random rand = new Random();
		while (randomNum.size() < 6) {
			randomNum.add(rand.nextInt(45) + 1);
		}

		do {
			bonusNum = rand.nextInt(45) + 1;
		} while (randomNum.contains(bonusNum));
		
		// TODO 테스트 데이터
//		randomNum.add(1);
//		randomNum.add(2);
//		randomNum.add(3);
//		randomNum.add(4);
//		randomNum.add(5);
//		randomNum.add(6);
//		bonusNum = 7 ;
	}

	/**
	 * 추첨일 가져오기
	 * @param baseDate
	 * @return
	 */
	private Date getDrawDate(Date baseDate) {
		Calendar returnDate = Calendar.getInstance();
		returnDate.setTime(baseDate);
		
		// 기준일의 요일 가져오기 (1:일요일 ~ 7:토요일)
		int today   = returnDate.get(Calendar.DAY_OF_WEEK);
		// 기준일로부터 토요일까지 남은 일수
		int daysSat = Calendar.SATURDAY - today;

		// 토요일로 이동
		returnDate.add(Calendar.DAY_OF_MONTH, daysSat);
		returnDate.set(Calendar.HOUR_OF_DAY, 21);	// 9시
		returnDate.set(Calendar.MINUTE, 0);			// 00분
		returnDate.set(Calendar.SECOND, 0);			// 00초

		// baseDate 이 returnDate보다 나중이면 true
		if (baseDate.after(returnDate.getTime())) {
			// 다음주 토요일로 변경
			returnDate.add(Calendar.DAY_OF_MONTH, 7);
		}
		return returnDate.getTime();
	}

	/**
	 * 지급일
	 * @param baseDate
	 * @return
	 */
	private Date getLastDate(Date baseDate) {
		Calendar returnDate = Calendar.getInstance();
		returnDate.setTime(baseDate);
		returnDate.add(Calendar.YEAR, 1);			// + 1년
		returnDate.add(Calendar.DAY_OF_MONTH, 1);	// + 1일
		return returnDate.getTime();
	}

	public Set<Integer> getRandomNum() {
		return randomNum;
	}

	public int getBonusNum() {
		return bonusNum;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public Date getDrawDate() {
		return drawDate;
	}

	public Date getLastDate() {
		return lastDate;
	}

	
}