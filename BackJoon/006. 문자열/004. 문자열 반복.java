/**
 * 문제 번호 : 2675번
 * 문제 제목 : 문자열 반복
 * 문제 내용 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
 *               포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	// 스캐너 생성
		Scanner in = new Scanner(System.in);
		// 총 횟수
		int T = in.nextInt();
        
		for(int i = 0; i < T; i++) {
			// 입력 데이터
			int R = in.nextInt();
			String S = in.next();
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
