package playbaseball;

import java.util.Scanner;

public class BelowChar {
    IsInteger isInteger;
    Integer get;
    String getTrans;
    Scanner s;

    public BelowChar() {}
    
    public BelowChar(Integer get, String getTrans, Scanner s) {
        this.get = get;
        this.getTrans = getTrans;
        this.s = s;
        isInteger = new IsInteger(s);
    }

    public String IsBelow_3_Char() {
        // 3글자 미만의 수를 입력받았다면, 다시
        while(getTrans.length() != 3) {
            s = new Scanner(System.in);
            System.out.print("숫자를 입력해주세요: ");
            get = isInteger.onlyInteger();
            getTrans = Integer.toString(get);
        }

        return getTrans;
    }
}
