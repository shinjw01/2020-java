import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		//숫자 입력받기
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int tenDigit = num/10;		//10으로 나눈 몫	   -> 십의 자리 숫자
		int oneDigit = num%10;		//10으로 나눈 나머지 -> 일의 자리 숫자
		
		if(tenDigit == oneDigit)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
		
		scanner.close();
	}
}