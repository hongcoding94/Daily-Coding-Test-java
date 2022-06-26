/**
 * 문제 번호 : 1152번
 * 문제 제목 : 단어의 개수
 * 문제 내용 : 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 
 *                이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 */

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
    	// 스캐너 생성
        Scanner in = new Scanner(System.in);
        
        // 변수 담기
        String str = in.nextLine();
        // String str = "The last character is a blank ";
        String[] strArray = str.split(" ");
        int cnt = 0;
        // System.out.println("== 테스트 진행중 ==");
       	
        // 로직
        for(String x : strArray) {
        	// System.out.println(x);
            if(x.length() != 0) {
            	cnt++;
            }
        }
        System.out.println(cnt);
       	
    }
}
