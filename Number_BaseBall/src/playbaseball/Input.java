package playbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	public List<Integer> getNumbers() {
		List<Integer> myArr = new ArrayList<>();
		BelowChar belowChar = new BelowChar();
		Scanner s = new Scanner(System.in);
		IsInteger isInteger = new IsInteger(s);
		System.out.print("숫자를 입력해주세요: ");
		
		// 자료형이 정수가 아니라면 재입력
		int get = isInteger.onlyInteger();
		String getTrans = Integer.toString(get);
		
		// 3글자 미만의 수를 입력받았다면 재입력
		belowChar = new BelowChar(get, getTrans, s);
		getTrans = belowChar.IsBelow_3_Char();
		
		// 중복값 제거
		RemoveDuplication removeDuplication = new RemoveDuplication(getTrans.split(""));

		List<String> splitTrans = removeDuplication.remove();

		// 중복된 수를 제거했을 때의 길이가 3글자 미만인 경우
		while(splitTrans.size() < 3) {
			System.out.print("중복되지 않은 숫자를 입력해주세요: ");
			get = isInteger.onlyInteger();
			getTrans = Integer.toString(get);
			belowChar = new BelowChar(get, getTrans, s);
			getTrans = belowChar.IsBelow_3_Char();
			removeDuplication = new RemoveDuplication(getTrans.split(""));
			splitTrans = removeDuplication.remove();
		}
		
		// 사용자 입력 추가
		for(String a : splitTrans) {
			myArr.add(Integer.parseInt(a));
		}
		
		return myArr;
	}
}
