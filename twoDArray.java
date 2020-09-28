
public class twoDArray {

	public static void main(String[] args) {
		int row, col, num;
		//4X4 2차원 배열 생성
		int arr[][] = new int[4][4];
		
		//배열의 모든 원소를 0으로 초기화
		for(row=0;row<arr.length;row++)
			for(col=0;col<arr[row].length;col++)
				arr[row][col]=0;
		
		//반복문 돌면서 랜덤한 정수,행,열 생성
		for(int i = 0; i < 10;i++) {
			num = (int)(Math.random()*10+1);
			row = (int)(Math.random()*4);
			col = (int)(Math.random()*4);
			//만약 랜덤하게 선택된 배열의 칸이 비어있으면 값을 대입하고, 비어있지 않으면 다시 선택
			if(arr[row][col]!=0)
				i--;
			else
				arr[row][col]=num;
		}
		
		//2차원 배열 출력
		for(row=0;row<arr.length;row++) {
			for(col=0;col<arr[row].length;col++)
				System.out.print(arr[row][col]+"\t");
			System.out.println();
		}

	}

}
