
import java.util.Scanner;
import java.util.InputMismatchException;

public class RandomArray {

	public static void main(String[] args) {
		int howMany, num, isSame;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇 개?  ");
		
		//스캐너를 통해 입력값 저장 & 입력 받은 값의 유효성 체크
		while(true) {
			//try-catch: 정수 입력을 안 했을 때 1차 거름
			try {
				howMany = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("올바른 값이 아닙니다. 100 미만 자연수를 입력하세요.");
				scanner.nextLine();
				continue;
			}
			//if-else : 100미만 자연수가 아닌 정수들을 2차 거름
			if(howMany>=1 && howMany<100)
				break;
			else {
				System.out.println("올바른 값이 아닙니다. 100 미만 자연수를 입력하세요.");
				scanner.nextLine();
				}
		}
		
		//입력받은 값의 크기만큼 정수 배열 생성&초기화
		int numArr[] = new int[howMany];
		for(int i = 0 ; i<numArr.length;i++)
			numArr[i]=0;
		
		//배열의 크기만큼 반복하면서
		for(int i=0;i<numArr.length;i++) {
			//랜덤정수 중복 변수 초기화
			isSame=0;
			//랜덤정수 num 생성
			num = (int)(Math.random()*100 + 1);
			//랜덤정수가 이미 배열 안에 존재하는지 검사
			for(int j=0;j<=i;j++) {
				if(numArr[j]==num) {
					isSame=1;
					break;
				}
			}
			//배열 안에 없다면 저장
			if(isSame==1)
				i--;
			else
				numArr[i]=num;
		}
		
		//배열을 화면에 출력
		for(int i = 0;i<numArr.length;i++) {
			System.out.print(numArr[i]+" ");
			if(i%10 ==9)
				System.out.println();
		}
		
		
		//스캐너 종료
		scanner.close();
	}

}
