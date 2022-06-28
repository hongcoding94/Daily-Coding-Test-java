/**
 * 문제 번호 : 11718번
 * 문제 제목 : 그대로 출력하기
 * 문제 내용 : 입력 받은 대로 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            System.out.println(in.nextLine());
        }
        in.close();
    }
}
