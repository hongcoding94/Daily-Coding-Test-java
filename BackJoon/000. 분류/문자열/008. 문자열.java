/**
 * 문제 번호 : 9086번
 * 문제 제목 : 문자열
 * 문제 내용 : 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0 ; i < N ; i++) {
            String a = in.next();
            int l = a.length();
            // ChackPoint1. 첫 단어 출력
            String first = String.valueOf(a.charAt(0));
            // ChackPoint2. 마지막 단어 출력
            String last = String.valueOf(a.charAt(l-1));
            System.out.println(first + last);
        }
    }
}
