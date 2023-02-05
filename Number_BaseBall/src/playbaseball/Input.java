package playbaseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {
	public List<Integer> getNumbers() {
		List<Integer> myArr = new ArrayList<>();
	
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요: ");
		
		// 입력값은 정수형
		int get = s.nextInt();
		String getTrans = Integer.toString(get);
		
		// 3글자 미만의 수를 입력받았다면, 다시
		while(getTrans.length() < 3) {
			s = new Scanner(System.in);
			System.out.println("3개 이상의 숫자를 입력해주세요: ");
			get = s.nextInt();
			getTrans = Integer.toString(get);
		}
		
		// 중복값 제거
		List<String> splitTrans = Arrays.asList(getTrans.split(""));
		splitTrans = splitTrans.stream()
		.distinct().collect(Collectors.toList());
		while(splitTrans.size() < 3) {
			s = new Scanner(System.in);
			System.out.println("중복되지 않은 숫자를 입력해주세요: ");
			get = s.nextInt();
			getTrans = Integer.toString(get);
			
			splitTrans = Arrays.asList(getTrans.split(""));
			splitTrans = splitTrans.stream()
			.distinct().collect(Collectors.toList());
		}
		
		// 사용자 입력 추가
		for(String a : splitTrans) {
			
			myArr.add(Integer.parseInt(a));
			
			// 3자리 이상이라면, 즉시 반환
			if(myArr.size() > 3) {
				String getApply = getTrans.substring(0, 3);
				System.out.println(getApply + "까지의 숫자만 반영되었습니다.");
				return myArr;
			}
		}
		
		
		
		return myArr;
	}
}
