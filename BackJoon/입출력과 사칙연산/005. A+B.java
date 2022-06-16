/**
 * 문제 번호 : 1000번
 * 문제 제목 : A+B
 * 문제 내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 스캐너 생성
    Scanner in = new Scanner(System.in);

    // 변수 생성 및 데이터 담기
    int i = in.nextInt();
    int j = in.nextInt();

    // 로직
    if(0 < i && j < 10){
    	int k = i + j;
        System.out.println(k);
    	}  
    }
    in.close();
}
