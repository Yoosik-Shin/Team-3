package mission.Q13_컬렉션_로또;

import java.util.Set;

public class UserGame {
	private Set<Integer> numbers;
	private String       type; // "자동" 또는 "수동"
	private String       rank; // 당첨 여부

	public UserGame(Set<Integer> numbers, String type) {
		this.numbers = numbers;
		this.type    = type;
	}

	public Set<Integer> getNumbers() {
		return numbers;
	}

	public String getType() {
		return type;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}