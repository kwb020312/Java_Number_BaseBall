package playbaseball;

public class Test {

	public static void main(String[] args) {
		// 컴퓨터 수 생성
		GenerateNumber computerNum = new GenerateNumber();
		// 사용자 수 입력
		Input userNum = new Input();
		Check check = new Check();
		System.out.println("컴퓨터가 뽑은 수: "+computerNum.getNumbers());
		System.out.println("중복된 수: " + check.matchLength(computerNum.getNumbers(), userNum.getNumbers()));
	}

}
