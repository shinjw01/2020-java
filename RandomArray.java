
import java.util.Scanner;
import java.util.InputMismatchException;

public class RandomArray {

	public static void main(String[] args) {
		int howMany, num, isSame;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �� ��?  ");
		
		//��ĳ�ʸ� ���� �Է°� ���� & �Է� ���� ���� ��ȿ�� üũ
		while(true) {
			//try-catch: ���� �Է��� �� ���� �� 1�� �Ÿ�
			try {
				howMany = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("�ùٸ� ���� �ƴմϴ�. 100 �̸� �ڿ����� �Է��ϼ���.");
				scanner.nextLine();
				continue;
			}
			//if-else : 100�̸� �ڿ����� �ƴ� �������� 2�� �Ÿ�
			if(howMany>=1 && howMany<100)
				break;
			else {
				System.out.println("�ùٸ� ���� �ƴմϴ�. 100 �̸� �ڿ����� �Է��ϼ���.");
				scanner.nextLine();
				}
		}
		
		//�Է¹��� ���� ũ�⸸ŭ ���� �迭 ����&�ʱ�ȭ
		int numArr[] = new int[howMany];
		for(int i = 0 ; i<numArr.length;i++)
			numArr[i]=0;
		
		//�迭�� ũ�⸸ŭ �ݺ��ϸ鼭
		for(int i=0;i<numArr.length;i++) {
			//�������� �ߺ� ���� �ʱ�ȭ
			isSame=0;
			//�������� num ����
			num = (int)(Math.random()*100 + 1);
			//���������� �̹� �迭 �ȿ� �����ϴ��� �˻�
			for(int j=0;j<=i;j++) {
				if(numArr[j]==num) {
					isSame=1;
					break;
				}
			}
			//�迭 �ȿ� ���ٸ� ����
			if(isSame==1)
				i--;
			else
				numArr[i]=num;
		}
		
		//�迭�� ȭ�鿡 ���
		for(int i = 0;i<numArr.length;i++) {
			System.out.print(numArr[i]+" ");
			if(i%10 ==9)
				System.out.println();
		}
		
		
		//��ĳ�� ����
		scanner.close();
	}

}
