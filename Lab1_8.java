import java.util.Scanner;

public class Lab1_8 {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		Scanner scanner = new Scanner(System.in);
		
		//x1,y1, x2, y2 입력받기
		System.out.print("x1, y1 입력 >>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		
		System.out.print("x2, y2 입력 >>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		//주어진 직사각형과 충돌하지 않도록 상하좌우에 직사각형을 놓는다고 생각했을때, 상하좌우의 직사각형을 만족시키는 각각의 조건을 ||(or)로 연결한다.
		//직사각형과 직사각형이 접하는 경우도 충돌로 생각하고 조건을 잡았다.
		if (x1>200 || x2<100 || y1>200 || y2<100)	// 순서대로 우, 좌, 하, 상의 직사각형의 조건이다.(컴퓨터내그래픽좌표기준)
			System.out.println("충돌 없음");
		else
			System.out.println("충돌 발생");
		
		scanner.close();
	}

}
