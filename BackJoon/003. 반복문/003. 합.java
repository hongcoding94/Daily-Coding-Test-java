/**
 * 문제 번호 : 8393번
 * 문제 제목 : 합
 * 문제 내용 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner in = new Scanner(System.in);		

		// 입력 받을 전역 변수
		int i = in.nextInt(); 
		int an = 0;
        
		// 로직
		for(int j = 1; j<=i; j++) {
			an += j;
		}
		
		// 출력 
		System.out.println(an);

		// 자원 닫기
		in.close();

	}
}
