import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {
		
		int num1, num2, num3, middle=0;
		
		//���� �Է¹ޱ�
		System.out.print("���� 3�� �Է�>>");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		//�߰��� �����ϱ�
		/*num1 num2 �� ū ���� �߰����� �־�ξ��ٰ� num3�� �߰����� ���Ͽ�
		 * 1. num3�� ũ�� �߰����� �״�� ����
		 * 2. �߰����� ũ�� num1�� num2 �� ���� ���� num3�� ���Ͽ� �� �� ū ���� �߰����� ����*/
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
		
		System.out.println("�߰� ���� "+middle);
		
		scanner.close();
	}

}
