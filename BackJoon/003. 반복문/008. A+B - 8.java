/**
 * 문제 번호 : 11022번
 * 문제 제목 : A+B - 8
 * 문제 내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner in = new Scanner(System.in);		

		// 입력 받을 전역 변수
		int i = in.nextInt(); 

		// 로직
		for(int j=1; j<=i; j++) {
			int h = in.nextInt();
			int k = in.nextInt();
			System.out.println("Case #"+ j + ": " + h + " + "+ k + " = " + (h+k));
		}

		// 자원 닫기
		in.close();

	}
}
