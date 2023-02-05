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
				System.out.println("중복된 숫자가 감지되었습니다.");
				return getNumbers();
			}
			

			myArr.add(Integer.parseInt(a));
			
			// 3자리 이상이라면, 즉시 반환
			if(myArr.size() >= 3) {
				String getApply = getTrans.substring(0, 3);
				System.out.println(getApply + "까지의 숫자만 반영되었습니다.");
				return myArr;
			}
		}
		
		
		
		return myArr;
	}
}
