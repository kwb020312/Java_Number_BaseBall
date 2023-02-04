package playbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	public List<Integer> getNumbers() {
		List<Integer> myArr = new ArrayList<>();
	
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
			
			myArr.add(Integer.parseInt(a));
			
			// 3자리 이상이라면, 즉시 반환
			if(myArr.size() >= 3) return myArr;
		}
		
		
		
		return myArr;
	}
}
