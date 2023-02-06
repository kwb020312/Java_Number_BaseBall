package playbaseball;

import java.util.List;

public class Run {

	public static void main(String[] args) {
		GenerateNumber generateNumber = new GenerateNumber();
		Input input = new Input();
		Result result = new Result();
		RePlay replay = new RePlay();
		
		boolean rePlayFlag = true;
		
		while(rePlayFlag) {
			List<Integer> computer = generateNumber.getNumbers();
			List<Integer> user = input.getNumbers();
			String curResult = result.getResult(computer, user);
			System.out.println(curResult);   
			
			while(!curResult.equals("3스트라이크")) {
				user = input.getNumbers();
				curResult = result.getResult(computer, user);
				System.out.println(curResult);
			}
			rePlayFlag = replay.replay(); 
		}
	}

}
