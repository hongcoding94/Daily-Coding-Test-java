/**
 * 문제 번호 : 11720번
 * 문제 제목 : 숫자의 합
 * 문제 내용 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // 스캐너 생성
    Scanner in = new Scanner(System.in);
    
    // 리스트 생성
    int i = in.nextInt();
    String s = in.next();
    int sum = 0;

	// 로직
	for(int j=0; j<i; j++) {
    	sum += s.charAt(j) - '0';
    }
    
    // 출력
    System.out.println(sum);
    
    // 스캐너 삭제
    in.close();
  }
}
