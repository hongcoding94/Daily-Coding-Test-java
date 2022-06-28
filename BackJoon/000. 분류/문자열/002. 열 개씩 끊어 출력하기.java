/**
 * 문제 번호 : 11721번
 * 문제 제목 : 열 개씩 끊어 출력하기
 * 문제 내용 : 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 *            한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public String solution(String X) {
		// 변수
		int txtLen = X.length();
		int txtMaxLen = 10;
		int txtloopCnt = txtLen / txtMaxLen + 1;
		String answer = "";
		
		// CheckPonit1. 문장이 총 몇번이 돌아야하는지?
		for(int i=0; i<txtloopCnt; i++) {
            // CheckPoint2. IastIndex를 설정하면 StringIndexOutOfBoundsException 오류가 발생하여 해당 부분 처리
			int lastIndex = (i + 1) * txtMaxLen;
			
			// CheckPoint3. IastIndex를 설정으로 인한 if문 처리
			if(txtLen > lastIndex) {
				answer += X.substring(i * txtMaxLen, lastIndex) + "\n";
			} else {
				answer += X.substring(i * txtMaxLen);
			}
		}
		return answer;
	}
	
	public static void main(String[]args) {
		Main M = new Main();
		Scanner in = new Scanner(System.in);
		
		String X = in.next();
        in.close();
        
		System.out.println(M.solution(X));
	}
}
