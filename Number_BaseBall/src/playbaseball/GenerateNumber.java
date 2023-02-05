package playbaseball;

import java.util.ArrayList;
import java.util.List;

public class GenerateNumber {
	// 1~9 난수 생성
	public int random() {
		return (int)(Math.random() * 9 + 1);
	}
	
	// 컴퓨터 숫자배열
	public List<Integer> getNumbers() {
		List<Integer> comArr = new ArrayList<>();
		
		// 중복되지 않은 3가지 수 뽑기
		while(comArr.size() < 3) {
			int curNumber = random();
			
			if(!comArr.contains(curNumber)) {
				comArr.add(curNumber);
			}
		}
		
		return comArr;
	}
}
