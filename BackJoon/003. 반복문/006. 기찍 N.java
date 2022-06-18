/**
 * 문제 번호 : 2742번
 * 문제 제목 : N 기찍
 * 문제 내용 : 
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
