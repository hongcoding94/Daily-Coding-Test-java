/**
 * 문제 번호 : 10951번
 * 문제 제목 : A+B - 4
 * 문제 내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	
        // 스캐너 생성
        Scanner in = new Scanner(System.in);
        
        //로직
        while(in.hasNextInt()) {
        	int i = in.nextInt();
            int j = in.nextInt();
            System.out.println(i+j);
        }
        
        // 스캐너 해제
        in.close();
        
    }
}
