import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberBaseBall {

    public static List<Integer> generateNumbers() {
        List<Integer> comArr = new ArrayList<>();

        while(comArr.size() < 3) {
            int curNumber = (int)(Math.random() * 9 + 1);

            if(!comArr.contains(curNumber)) {
                comArr.add(curNumber);
            }
        }

        return comArr;
    }

    public static boolean isValidNumbers(String numbers) {

        // 개행을 입력한 경우
        if(numbers.length() == 0) {
            System.out.println("값이 입력되지 않았습니다.");
            return false;
        // 0을 입력한 경우
        } else if (numbers.indexOf("0") != -1) {
            System.out.println("0을 포함할 수 없습니다.");
            return false;
        } else if (numbers.length() != 3) {
            System.out.println("길이가 3이 아닌 수 입니다.");
            return false;
        } else if (numbers.length() != numbers.replaceAll("[^0-9]","").length()) {
            System.out.println("문자가 입력되었습니다.");
            return false;
        }

        return true;
    }
 
    public static List<Integer> getMyNumbers() {
        List<Integer> userArr = new ArrayList<>();
        Scanner s;
        while(userArr.size() < 1) {
            s = new Scanner(System.in);
            System.out.print("숫자를 입력해주세요: ");
            String answer = s.nextLine();
            if(!isValidNumbers(answer)) {
                continue;
            }

            for(String number: answer.split("")) {
                userArr.add(Integer.parseInt(number));
            }
        }

        return userArr;
    }

    public static boolean Replay() {
        System.out.println("다시 시작하시겠습니까??");
		System.out.println("Yes: 1, No: 2");
		Scanner s = new Scanner(System.in);
		int flag = s.nextInt();
		return flag == 1;
    }

    public static String getResult(List<Integer> computer, List<Integer> user) {
        int matches = 0;
		
		for(int i = 0 ; i < 3; i ++) {
			if(computer.contains(user.get(i))) {
				matches++;
			}
		}

        int strike = 0;
		
		for(int i = 0 ; i < 3 ; i ++) {
			int curComputer = computer.get(i);
			int curUser = user.get(i);
			
			if(curComputer == curUser) strike++;
		}

        // 총 정답 수

		int ball = matches - strike;
		
		if(matches == 0) return "낫싱";
		if(ball == 0) return strike + "스트라이크";
		if(strike == 0) return ball + "볼";
		return strike + "스트라이크 " + ball + "볼";
    }

    public static void Play() {
        List<Integer> comNumbers;
        List<Integer> myNumbers;
        boolean restart = true;

        while(restart) {
            comNumbers = generateNumbers();
            myNumbers = getMyNumbers();
            String curResult = getResult(comNumbers, myNumbers);
            System.out.println(curResult);

            while(!curResult.equals("3스트라이크")) {
                myNumbers = getMyNumbers();
                curResult = getResult(comNumbers, myNumbers);
                System.out.println(curResult);
            }
            restart = Replay();
        }

    }

    public static void main(String[] args) {
         Play();
    }

}