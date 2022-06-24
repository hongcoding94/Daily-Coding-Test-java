/**
 * 문제 번호 : 1157번
 * 문제 제목 : 단어 공부
 * 문제 내용 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 
 *             알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 */

import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// 스캐너 생성
        Scanner in = new Scanner(System.in);
        // 배열 생성
		int[] arr = new int[26];
		String s = in.next();
        
        // 스캐너 닫기
        in.close();
        
		for (int i = 0; i < s.length(); i++){
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
				arr[s.charAt(i) - 'A']++;	// 해당 인덱스의 값 1 증가
			}
			else {	// 소문자 범위
				arr[s.charAt(i) - 'a']++;
			}
		}
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}
}
