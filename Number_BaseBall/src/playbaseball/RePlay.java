package playbaseball;

import java.util.Scanner;

public class RePlay {
	public boolean replay() {
		System.out.println("다시 시작하시겠습니까??");
		System.out.println("Yes: 1, No: 2");
		Scanner s = new Scanner(System.in);
		int flag = s.nextInt();
		return flag == 1;
		
	}
}
