import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
		
		int num, clap = 0;
		String ment;
		
		//���� �Է¹ޱ�
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		//�ڼ� ���� üũ
		if((num>=10) && ((num/10)%3==0)) //num�� ���� �ڸ����� �����ϰ�(0�� �ƴϰ�),�� ���� �ڸ����� 3���� ��������� ��(3,6,9�� ��)
			clap++;
		if((num%10 != 0) && (num%10)%3==0) //num�� ���� �ڸ����� 0�� �ƴϰ�, �� ���� �ڸ����� 3���� ��������� ��(3,6,9�� ��)
			clap++;
		
		//�ڼ� ������ ���� ����� ���� ��Ʈ�� ����
		switch(clap) {
		case 1: ment = "¦"; break;
		case 2: ment = "¦¦"; break;
		default: ment = "����";break;
		}
		
		System.out.println("�ڼ�"+ment);
		
		scanner.close();
	}

}
