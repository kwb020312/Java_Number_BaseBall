package playbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	public List<Integer> getNumbers() {
		List<Integer> myArr = new ArrayList<>();

		System.out.print("숫자를 입력해주세요: ");

		Scanner s = new Scanner(System.in);
		CheckInputValue checkInputValue = new CheckInputValue(s);
		
		// 자료형이 정수가 아니라면 재입력
		int value = checkInputValue.check();		
		String strValue = Integer.toString(value);
		
		// 중복값 제거
		RemoveDuplication removeDuplication = new RemoveDuplication(strValue.split(""));

		List<String> listStr = removeDuplication.remove();

		// 중복된 수를 제거했을 때의 길이가 3글자 미만인 경우
		while(listStr.size() < 3) {
			System.out.print("중복되지 않은 숫자를 입력해주세요: ");
			value = checkInputValue.check();
			strValue = Integer.toString(value);
			removeDuplication = new RemoveDuplication(strValue.split(""));
			listStr = removeDuplication.remove();
		}
		
		
		// 사용자 입력 추가
		for(String a : listStr) {
			myArr.add(Integer.parseInt(a));
		}
		
		return myArr;
	}
}
