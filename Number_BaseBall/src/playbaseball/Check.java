package playbaseball;

import java.util.List;

public class Check {
	public int matchLength(List<Integer> computer, List<Integer> user) {
		int matches = 0;
		
		for(int i = 0 ; i < 3; i ++) {
			if(computer.contains(user.get(i))) {
				matches++;
			}
		}
		
		return matches;
	} 
	
	public int strikeCount(List<Integer> computer, List<Integer> user) {
		int strike = 0;
		
		for(int i = 0 ; i < 3 ; i ++) {
			int curComputer = computer.get(i);
			int curUser = user.get(i);
			
			if(curComputer == curUser) strike++;
		}
		
		return strike;
	}
}
