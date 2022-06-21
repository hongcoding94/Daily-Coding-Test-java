/* 
 * 문제 번호 : 2577번
 * 문제 제목 : 숫자의 개수
 * 문제 내용 : 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 
 *             결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 *             예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 *             계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
   // 스캐너 생성
   Scanner in = new Scanner(System.in);
   
   // 변수 생성 및 데이터 입력
   int i = in.nextInt();
   int j = in.nextInt();
   int k = in.nextInt();
   int num = i * j * k;
   String msg = Integer.toString(num);
   
   // 스캐너 제거
   in.close();
   
   // 로직 - 1~9까지 변수담기
   for(int a = 0; a< 10 ; a++) {
      int cnt = 0;
      for(int b = 0; b< msg.length(); b++) {
		    if((msg.charAt(b) - '0') == a) {
			    cnt++;
		    }
	    }
	    System.out.println(cnt);
   }
  }
}

