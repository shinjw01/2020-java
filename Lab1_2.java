import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		//���� �Է¹ޱ�
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int tenDigit = num/10;		//10���� ���� ��	   -> ���� �ڸ� ����
		int oneDigit = num%10;		//10���� ���� ������ -> ���� �ڸ� ����
		
		if(tenDigit == oneDigit)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
		
		scanner.close();
	}
}