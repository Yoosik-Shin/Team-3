package mission.Q14_컬렉션_코딩대회;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

// ALOHA 스터디에서 월말 코딩대회를 열었다.
// 매니저는 학생들의 성적을 취합하여 "student.txt" 파일로 정리하였다.
// 한학생의 성적은 다음과 같은 양식으로 기록되어있다.
// txt 파일에서 학생들의 성적정보(번호/이름/성적/수업이름)를 추출하여,
// 성적순으로 내림차순, 번호순으로 오름차순 정렬하여 출력하시오.
public class Manager {

	public static void main(String[] args) {

		LinkedList<Student> list = new LinkedList<Student>();
		list = getTxtToList(list);
		list = sortScoreAndNo(list);
		printList(list);
	}

	/**
	 * 리스트 정렬
	 * @param list
	 * @return
	 */
	public static LinkedList<Student> sortScoreAndNo(LinkedList<Student> list) {

		LinkedList<Student> newList = (LinkedList<Student>) list.clone();

		/* TODO 여기에 코드를 작성해보세요:D */
		Comparator<Student> com = (s1, s2) -> {

			// 성적순
			if (s1.getScore() > s2.getScore()) return -1;
			else if (s1.getScore() < s2.getScore()) return 1;
			else {
				// 번호순
				return s1.getNo() - s2.getNo();
			}
		};

		newList = newList.stream().sorted(com).collect(Collectors.toCollection(LinkedList::new));

		return newList;
	}

	/**
	 * 텍스트 파일입력
	 * @param list
	 * @return
	 */
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		File file = new File("student.txt");
		try (Scanner sc = new Scanner(file)) {

			Student std;
			while (sc.hasNextLine()) {
				String   stn  = sc.nextLine();
				String[] data = stn.split("/");

				int    no        = Integer.parseInt(data[0]);
				String name      = data[1];
				int    score     = Integer.parseInt(data[2]);
				String className = data[3];

				std = new Student(no, name, score, className);
				list.offer(std);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 리스트 출력
	 * @param list
	 */
	public static void printList(LinkedList<Student> list) {

		System.out.println("번호\t이름\t성적\t반");
		/* TODO 여기에 코드를 작성해보세요:D */
		list.stream().forEach(student -> {
			System.out.print(student.getNo() + "\t" + student.getName() + "\t");
			System.out.println(student.getScore() + "\t" + student.getClassName());
		});
		System.out.println("번호\t이름\t성적\t반");
		Collections.reverse(list);
		list.stream().forEach(student -> {
			System.out.print(student.getNo() + "\t" + student.getName() + "\t");
			System.out.println(student.getScore() + "\t" + student.getClassName());
		});
	}
}