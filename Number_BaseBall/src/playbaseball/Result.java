package playbaseball;

import java.util.List;

public class Result {
	Check check = new Check();
	public String getResult(List<Integer> computer, List<Integer> user) {
		// 총 중복 수
		int total = check.matchLength(computer, user); 
		int strike = check.strikeCount(computer, user);
		int ball = total - strike;
		
		if(total == 0) return "낫싱";
		if(ball == 0) return strike + "스트라이크";
		if(strike == 0) return ball + "볼";
		return strike + "스트라이크 " + ball + "볼";
	}
}
