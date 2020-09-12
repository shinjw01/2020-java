import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {
		
		int num1, num2, num3, middle=0;
		
		//숫자 입력받기
		System.out.print("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		//중간값 결정하기
		/*num1 num2 중 큰 쪽을 중간값에 넣어두었다가 num3과 중간값을 비교하여
		 * 1. num3이 크면 중간값은 그대로 유지
		 * 2. 중간값이 크면 num1과 num2 중 작은 쪽을 num3와 비교하여 둘 중 큰 쪽을 중간값에 대입*/
		if(num1<=num2) {
			middle=num2;
			if(num2>num3)
				middle=(num1>num3)?num1:num3;
		}
		
		if(num1>num2) {
			middle = num1;
			if(num1>num3)
				middle=(num2>num3)?num2:num3;
		}
		
		System.out.println("중간 값은 "+middle);
		
		scanner.close();
	}

}
