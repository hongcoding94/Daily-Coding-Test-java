/**
 * 문제 번호 : 11656번
 * 문제 제목 : 접미사 배열
 * 문제 내용 : 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
 *            baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
 *            문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main M = new Main();
		Scanner in = new Scanner(System.in);
		
		String X = in.next();
		in.close();
		System.out.println(M.solution(X));
	}
	
	public String solution(String X) {
		String[] arr = new String[X.length()];
		String answer = "";
		
		for(int i=0; i<X.length(); i++) {
			arr[i] = X.substring(i, X.length());
		}
		Arrays.sort(arr);
		
		for(String str : arr) {
			answer += str + "\n";
		}
		return answer;
	}

}
