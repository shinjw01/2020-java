
import java.util.Scanner;

public class GBBWithComputer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String userChoice, winner="";
		int userHand=0, comHand=0, whoWin=0;
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			//���� ���������� ���� �� ���� ���� ����
			System.out.print("���� ���� ��!>>");
			userChoice = scanner.next();
			if(userChoice.equals("�׸�"))
				break;
			
			//��ǻ�� �� ���������� ����
			comHand = (int)(Math.random()*3);
			
			//���� ������ ���������� ��ȯ
			for(int i = 0; i<str.length;i++)
				if(userChoice.equals(str[i])) {
					userHand=i;
					break;
				}
			
			//�����Ǵ�
			//���º�
			if(userHand == comHand)
				whoWin =2;
			//������ "����"�϶�
			else if(userHand==0) {
				if(comHand==1)
					whoWin = 1;
				else
					whoWin = 0;
			}
			//������ "����"�϶�
			else if(userHand==1) {
				if(comHand==2)
					whoWin = 1;
				else
					whoWin = 0;
			}
			//������ "��"�϶�
			else {
				if(comHand==0)
					whoWin = 1;
				else
					whoWin = 0;
			}
			
			
			//���п� ���� ��Ʈ ��ü
			switch(whoWin) {
			case 0 : winner = "����ڰ� �̰���ϴ�."; break;
			case 1 : winner = "��ǻ�Ͱ� �̰���ϴ�."; break;
			case 2 : winner = "���º��Դϴ�."; break;
			}
			
			//��� ���
			System.out.println("����� = "+userChoice+" , ��ǻ�� = "
					+ str[comHand]+" , "+winner);
		}
		
		System.out.println("������ �����մϴ�...");
		scanner.close();
	}

}
