import java.util.Scanner;

public class Lab1_10 {

	public static void main(String[] args) {
		int x1, y1, radius1, x2, y2, radius2;
		Scanner scanner = new Scanner(System.in);
		
		//���� �߽ɰ� ������ �Է¹ޱ�
		System.out.print("���� �߽� x1, y1, ������ radius1 >>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		radius1 = scanner.nextInt();
		
		System.out.print("���� �߽� x2, y2, ������ radius2 >>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		radius2 = scanner.nextInt();
		
		//�� ���� �߽� ������ �Ÿ� ���ϱ�
		double distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		//�� ���� �߽ɻ����� �Ÿ��� �� ���� �������� �� ���ϱ�
		if (distance >= radius1 + radius2)	//�� ���� �߽ɻ����� �Ÿ��� �������� �պ��� ũ�ų� ������ ��ġ�� �ʴ´�.(Ȥ�� ���Ѵ�.)
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		else								//�߽� �Ÿ��� ������ �պ��� ������ ��ģ��.
			System.out.println("�� ���� ���� ��ģ��.");
		
		scanner.close();
	}

}
