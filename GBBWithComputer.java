
import java.util.Scanner;

public class GBBWithComputer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String userChoice, winner="";
		int userHand=0, comHand=0, whoWin=0;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			//유저 가위바위보 선택 및 게임 종료 선지
			System.out.print("가위 바위 보!>>");
			userChoice = scanner.next();
			if(userChoice.equals("그만"))
				break;
			
			//컴퓨터 측 가위바위보 선택
			comHand = (int)(Math.random()*3);
			
			//유저 선택을 정수형으로 교환
			for(int i = 0; i<str.length;i++)
				if(userChoice.equals(str[i])) {
					userHand=i;
					break;
				}
			
			//승패판단
			//무승부
			if(userHand == comHand)
				whoWin =2;
			//유저가 "가위"일때
			else if(userHand==0) {
				if(comHand==1)
					whoWin = 1;
				else
					whoWin = 0;
			}
			//유저가 "바위"일때
			else if(userHand==1) {
				if(comHand==2)
					whoWin = 1;
				else
					whoWin = 0;
			}
			//유저가 "보"일때
			else {
				if(comHand==0)
					whoWin = 1;
				else
					whoWin = 0;
			}
			
			
			//승패에 따라 멘트 교체
			switch(whoWin) {
			case 0 : winner = "사용자가 이겼습니다."; break;
			case 1 : winner = "컴퓨터가 이겼습니다."; break;
			case 2 : winner = "무승부입니다."; break;
			}
			
			//결과 출력
			System.out.println("사용자 = "+userChoice+" , 컴퓨터 = "
					+ str[comHand]+" , "+winner);
		}
		
		System.out.println("게임을 종료합니다...");
		scanner.close();
	}

}
