
import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		String name;
		String course[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//���� �̸� �Է� �ޱ�
			System.out.print("���� �̸�>>");
			name = scanner.next();
			if(name.equals("�׸�"))
				break;
			//�迭���� ���� �̸� ã�� ���� ���, �迭 ������ ���Ҵµ� ���� �̸� �� ã���� ���� �����̶�� �˸�
			for(int i = 0;i<course.length;i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+"�� ������ "+score[i]);
					break;
				}
				if(i== course.length - 1)
					System.out.println("���� �����Դϴ�.");
			}
		}
		
		scanner.close();
	}

}
