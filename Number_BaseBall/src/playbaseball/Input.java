package playbaseball;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	public ArrayList<String> getNumbers() {
		ArrayList<String> myArr = new ArrayList<>();
	
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요: ");
		
		// 입력값은 정수형
		int get = s.nextInt();
		String getTrans = Integer.toString(get);
		
		// 중복값이 있다면, 재귀
		for(String a : getTrans.split("")) {
			if(myArr.contains(a)) {
				return getNumbers();
			}
			
			myArr.add(a);
		}
		
		
		
		return myArr;
	}
}
