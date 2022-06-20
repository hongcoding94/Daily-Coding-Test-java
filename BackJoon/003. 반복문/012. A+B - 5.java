/**
 * 문제 번호 : 10952번
 * 문제 제목 : A+B - 5 
 * 문제 내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner in = new Scanner(System.in);		

		// 로직
		while(true) {
			int h = in.nextInt();
			int k = in.nextInt();

			// h-0 k-0으로 둘다 들어 올 경우
			if( h==0 && k==0) {
				// 조건 합당하면 반복문 종료
				break;
			}
		
			// 출력
			System.out.println(h+k);
		}

		// 자원 닫기
		in.close();
	}
}
