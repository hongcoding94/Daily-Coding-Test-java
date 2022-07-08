/**
 * 문제 번호 : 2440번
 * 문제 제목 : 별 찍기 - 3
 * 문제 내용 : 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Main M = new Main();
	    Scanner in = new Scanner(System.in);
	
	    int cnt = in.nextInt();
	    in.close();
	    System.out.println(M.solution(cnt));
    }
    
    public String solution(int cnt) {
	    String answer = "";

	    for(int i=0; i<cnt; i++) {
	    	for(int j=i+1; j<=cnt; j++) {
 	                   answer += "*";
            	}        
                answer += "\n";
	    }
	    return answer;
    }
}
