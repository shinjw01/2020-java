
import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//��ǥ���ĺ� �Է¹ޱ�
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>  ");
		String s = scanner.next();
		char c = s.charAt(0);
		
		//��ǥ���ĺ��� ���� 'a'�� �����������, 'a'���� ���� ��ǥ���ĺ����� ����ϵ��� �ۼ�
		for(char i = 'a';i<=c;c--) {
			for(char j = 'a';j<=c;j++)
				System.out.print(j);
			System.out.println();
		}
		
		scanner.close();
	}

}
