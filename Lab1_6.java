import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
		
		int num, clap = 0;
		String ment;
		
		//숫자 입력받기
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		//박수 갯수 체크
		if((num>=10) && ((num/10)%3==0)) //num이 십의 자리수가 존재하고(0이 아니고),그 십의 자리수가 3으로 나누어떨어질 때(3,6,9일 때)
			clap++;
		if((num%10 != 0) && (num%10)%3==0) //num의 일의 자리수가 0이 아니고, 그 일의 자리수가 3으로 나누어떨어질 때(3,6,9일 때)
			clap++;
		
		//박수 갯수에 따라 결과에 붙을 멘트를 결정
		switch(clap) {
		case 1: ment = "짝"; break;
		case 2: ment = "짝짝"; break;
		default: ment = "없음";break;
		}
		
		System.out.println("박수"+ment);
		
		scanner.close();
	}

}
