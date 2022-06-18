/**
 * 문제 번호 : 2741번
 * 문제 제목 : 기찍 N
 * 문제 내용 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner in = new Scanner(System.in);		

		// 입력 받을 전역 변수
		int i = in.nextInt(); 

		for(int j=1; i>=j; i--) {
			System.out.println(i);
		}

		// 자원 닫기
		in.close();
	}
}
