import java.util.Scanner;

public class Lab1_10 {

	public static void main(String[] args) {
		int x1, y1, radius1, x2, y2, radius2;
		Scanner scanner = new Scanner(System.in);
		
		//원의 중심과 반지름 입력받기
		System.out.print("원의 중심 x1, y1, 반지름 radius1 >>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		radius1 = scanner.nextInt();
		
		System.out.print("원의 중심 x2, y2, 반지름 radius2 >>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		radius2 = scanner.nextInt();
		
		//두 원의 중심 사이의 거리 구하기
		double distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		//두 원의 중심사이의 거리와 두 원의 반지름의 합 비교하기
		if (distance >= radius1 + radius2)	//두 원의 중심사이의 거리가 반지름의 합보다 크거나 같으면 겹치지 않는다.(혹은 접한다.)
			System.out.println("두 원은 서로 겹치지 않는다.");
		else								//중심 거리가 반지름 합보다 작으면 겹친다.
			System.out.println("두 원은 서로 겹친다.");
		
		scanner.close();
	}

}
