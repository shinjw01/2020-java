import java.util.Scanner;

public class Lab1_8 {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		Scanner scanner = new Scanner(System.in);
		
		//x1,y1, x2, y2 �Է¹ޱ�
		System.out.print("x1, y1 �Է� >>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		
		System.out.print("x2, y2 �Է� >>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		//�־��� ���簢���� �浹���� �ʵ��� �����¿쿡 ���簢���� ���´ٰ� ����������, �����¿��� ���簢���� ������Ű�� ������ ������ ||(or)�� �����Ѵ�.
		//���簢���� ���簢���� ���ϴ� ��쵵 �浹�� �����ϰ� ������ ��Ҵ�.
		if (x1>200 || x2<100 || y1>200 || y2<100)	// ������� ��, ��, ��, ���� ���簢���� �����̴�.(��ǻ�ͳ��׷�����ǥ����)
			System.out.println("�浹 ����");
		else
			System.out.println("�浹 �߻�");
		
		scanner.close();
	}

}
