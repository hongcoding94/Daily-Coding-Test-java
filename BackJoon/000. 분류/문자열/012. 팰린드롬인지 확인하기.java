/**
 * 문제 번호 : 10988번
 * 문제 제목 : 팰린드롬인지 확인하기
 * 문제 내용 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		
        // 팰린드롬이면
		if(str.equals(reverse)) {
			System.out.println("1");
        } 
        // 팰린드롬이 아니면
        else {
         System.out.println("0");   
        }
	}
}
