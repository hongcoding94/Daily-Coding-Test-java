/**
 * 문제 번호 : 2439번
 * 문제 제목 : 별 찍기 - 2
 * 문제 내용 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *            하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 */

import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
        Scanner in = new Scanner(System.in);
 
        // 변수 선언
		int N = in.nextInt();
		// 스캐너 해제
        in.close();
 
        // 로직
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
