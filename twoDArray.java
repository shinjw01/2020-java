
public class twoDArray {

	public static void main(String[] args) {
		int row, col, num;
		//4X4 2���� �迭 ����
		int arr[][] = new int[4][4];
		
		//�迭�� ��� ���Ҹ� 0���� �ʱ�ȭ
		for(row=0;row<arr.length;row++)
			for(col=0;col<arr[row].length;col++)
				arr[row][col]=0;
		
		//�ݺ��� ���鼭 ������ ����,��,�� ����
		for(int i = 0; i < 10;i++) {
			num = (int)(Math.random()*10+1);
			row = (int)(Math.random()*4);
			col = (int)(Math.random()*4);
			//���� �����ϰ� ���õ� �迭�� ĭ�� ��������� ���� �����ϰ�, ������� ������ �ٽ� ����
			if(arr[row][col]!=0)
				i--;
			else
				arr[row][col]=num;
		}
		
		//2���� �迭 ���
		for(row=0;row<arr.length;row++) {
			for(col=0;col<arr[row].length;col++)
				System.out.print(arr[row][col]+"\t");
			System.out.println();
		}

	}

}
