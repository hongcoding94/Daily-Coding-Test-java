/**
 * 문제 번호 : 11654번
 * 문제 제목 : 아스키 코드
 * 문제 내용 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
 *            주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
    	// 스캐너 생성
        Scanner in = new Scanner(System.in);
    	
        int code = in.next().charAt(0);
        System.out.print(code);
        
        // 스캐너 닫기
        in.close();
    }
}
