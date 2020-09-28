
public class Print2DArray {

	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		//행 단위로 줄바꿈하도록 작성
		for(int i=0;i<n.length;i++) {
			//현재 행의 열 원소를 출력하도록 작성
			for(int j=0;j<n[i].length;j++)
				System.out.print(n[i][j]+"\t");
			System.out.println();
		}

	}

}
