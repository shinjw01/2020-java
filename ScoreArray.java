
import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		String name;
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//과목 이름 입력 받기
			System.out.print("과목 이름>>");
			name = scanner.next();
			if(name.equals("그만"))
				break;
			//배열에서 과목 이름 찾아 점수 출력, 배열 끝까지 돌았는데 과목 이름 못 찾으면 없는 과목이라고 알림
			for(int i = 0;i<course.length;i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
				if(i== course.length - 1)
					System.out.println("없는 과목입니다.");
			}
		}
		
		scanner.close();
	}

}
