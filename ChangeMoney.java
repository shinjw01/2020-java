//�������� 50�� ������ �ְ�, ��°������ 50�� ���� �� �����̱淡 50�� ���� �ְ� �߽��ϴ�.
import java.util.Scanner;

public class ChangeMoney {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unit = {50000,10000, 1000, 500, 100, 50, 10, 1};
		
		//�ݾ� �Է� �ޱ�
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		
		//�ݾ� �������� ������ ���, ������ �� ��� = ��, ���� �� = ������
		for(int i=0; i<unit.length;i++) {
			System.out.println(unit[i]+"�� ¥�� : " + money/unit[i] + "��");
			money = money % unit[i];
		}
		
		scanner.close();
	}

}
