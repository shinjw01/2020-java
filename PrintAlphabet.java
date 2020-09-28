
import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//목표알파벳 입력받기
		System.out.print("소문자 알파벳 하나를 입력하시오>>  ");
		String s = scanner.next();
		char c = s.charAt(0);
		
		//목표알파벳이 점점 'a'에 가까워지도록, 'a'부터 현재 목표알파벳까지 출력하도록 작성
		for(char i = 'a';i<=c;c--) {
			for(char j = 'a';j<=c;j++)
				System.out.print(j);
			System.out.println();
		}
		
		scanner.close();
	}

}
