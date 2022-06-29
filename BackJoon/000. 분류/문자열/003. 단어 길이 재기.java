/**
 * 문제 번호 : 11721번
 * 문제 제목 : 단어 길이 재기
 * 문제 내용 : 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main{
    public int soultion(String X) {
        int answer = X.length();
	    return answer;
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner in = new Scanner(System.in);
        
        String str = in.next();
        in.close();
        
        System.out.println(M.soultion(str));
    }
}
