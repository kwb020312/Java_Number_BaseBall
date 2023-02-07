package playbaseball;

import java.util.Scanner;

public class CheckInputValue {
    Scanner s;

    public CheckInputValue() {}

    public CheckInputValue(Scanner s) {
        this.s = s;
    }

    // 숫자만 입력 가능
    public Integer check() {
        String box = s.nextLine();
        Integer boxNum = 0;
        
        // 개행을 입력한 경우
        if(box.length() == 0) {
            System.out.println("값이 입력되지 않았습니다.");
        // 0을 입력한 경우
        } else if (box.indexOf("0") != -1) {
            System.out.println("0을 포함할 수 없습니다.");
        } else if (box.length() != 3) {
            System.out.println("길이가 3이 아닌 수 입니다.");
        } else if (box.length() != box.replaceAll("[^0-9]","").length()) {
            System.out.println("문자가 입력되었습니다.");
        }
        

        // 정수가 아닌 값을 입력할 경우
        try {
            boxNum = Integer.parseInt(box);
        } catch(NumberFormatException e) {
        }

		int get = boxNum;

        return get;
    }
}
