/**
 * 문제 번호 : 10808번
 * 문제 제목 : 알파벳 개수
 * 문제 내용 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main M = new Main();
		Scanner in = new Scanner(System.in);
		String  str = in.nextLine();
		in.close();
		System.out.println(M.solution(str));
	}
	
	public String solution(String str){
		String answer = "";	
		// CheckPoint1. 해쉬맵 초기값 세팅
		HashMap<String, Integer> map = new HashMap<String, Integer>(){{
			// CheckPoint2. 아스키코드 소문자 기준 데이터 넣기
			for(int i=97; i<123; i++) {
				int cnt = 0;
				// System.out.println("char : " + i);
				for(int j=0; j<str.length(); j++) {					
					// CheckPoint3. 문자열에 대한 알파벳 갯수 체크
					if((char)i == str.charAt(j)) {
						cnt++;
						// System.out.println("cnt : " + cnt);
					}
				}				
				put(String.valueOf((char)i), cnt);
			}
		}};
		// CheckPoint4. 필요한 데이터 담아서 출력
		for(String x : map.keySet()) {
			// System.out.println(x + " / " + map.get(x));
			answer += map.get(x) + " ";
		}
		return answer;
	}
}
