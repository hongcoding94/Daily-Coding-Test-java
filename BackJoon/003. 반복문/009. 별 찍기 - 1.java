/**
 * 문제 번호 : 2438번
 * 문제 제목 : 별 찍기 - 1
 * 문제 내용 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner in = new Scanner(System.in);

		// 전역 변수 데이터 
		int i = in.nextInt();
        
		// 자원 닫기
		in.close();
        
		// 로직
		for(int j = 1; j <= i; j++) {
			for(int k = 1; k <= j; k++) {
			    System.out.print("*");
			}
			System.out.println();
		}
	}
}
