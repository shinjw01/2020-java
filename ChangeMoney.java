//문제에는 50원 단위가 있고, 출력결과에는 50원 단위 안 넣으셨길래 50원 단위 넣고 했습니다.
import java.util.Scanner;

public class ChangeMoney {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unit = {50000,10000, 1000, 500, 100, 50, 10, 1};
		
		//금액 입력 받기
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		//금액 단위별로 나눠서 출력, 단위의 돈 장수 = 몫, 남은 돈 = 나머지
		for(int i=0; i<unit.length;i++) {
			System.out.println(unit[i]+"원 짜리 : " + money/unit[i] + "개");
			money = money % unit[i];
		}
		
		scanner.close();
	}

}
