package playbaseball;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		GenerateNumber generateNumber = new GenerateNumber();
		Input input = new Input();
		Result result = new Result();
		
		List<Integer> computer = generateNumber.getNumbers();
		List<Integer> user = input.getNumbers();
		String res = result.getResult(computer, user); 
		
		System.out.println("Computer: " + computer);
		System.out.println("User: " + user);
		System.out.println(res);
	}

}
