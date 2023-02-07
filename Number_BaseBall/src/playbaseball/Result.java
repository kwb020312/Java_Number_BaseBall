package playbaseball;

import java.util.List;

public class Result {

	// 총 정답 수
	public int matchLength(List<Integer> computer, List<Integer> user) {
		int matches = 0;
		
		for(int i = 0 ; i < 3; i ++) {
			if(computer.contains(user.get(i))) {
				matches++;
			}
		}
		
		return matches;
	} 

	// 총 스트라이크 수
	public int matchStrike(List<Integer> computer, List<Integer> user) {
		int strike = 0;
		
		for(int i = 0 ; i < 3 ; i ++) {
			int curComputer = computer.get(i);
			int curUser = user.get(i);
			
			if(curComputer == curUser) strike++;
		}
		
		return strike;
	}

	public String getResult(List<Integer> computer, List<Integer> user) {
		// 총 정답 수
		int total = matchLength(computer, user); 
		int strike = matchStrike(computer, user);
		int ball = total - strike;
		
		if(total == 0) return "낫싱";
		if(ball == 0) return strike + "스트라이크";
		if(strike == 0) return ball + "볼";
		return strike + "스트라이크 " + ball + "볼";
	}
}
