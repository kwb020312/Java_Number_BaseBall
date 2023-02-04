package playbaseball;

public class Test {

	public static void main(String[] args) {
		// 컴퓨터 수 생성
		GenerateNumber test1 = new GenerateNumber();
		// 사용자 수 입력
		Input userNum = new Input();
		System.out.println("컴퓨터가 뽑은 수: "+test1.comNumbers());
		System.out.println("사용자가 입력한 수: " + userNum.getNumbers());
	}

}
