
public class Print2DArray {

	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		//�� ������ �ٹٲ��ϵ��� �ۼ�
		for(int i=0;i<n.length;i++) {
			//���� ���� �� ���Ҹ� ����ϵ��� �ۼ�
			for(int j=0;j<n[i].length;j++)
				System.out.print(n[i][j]+"\t");
			System.out.println();
		}

	}

}
