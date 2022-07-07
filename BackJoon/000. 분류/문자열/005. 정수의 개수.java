/**
 * 문제 번호 : 10821번
 * 문제 제목 : 정수의 개수
 * 문제 내용 : 숫자와 콤마로만 이루어진 문자열 S가 주어진다. 이때, S에 포함되어있는 정수의 개수를 구하는 프로그램을 작성하시오.
 *            S의 첫 문자와 마지막 문자는 항상 숫자이고, 콤마는 연속해서 주어지지 않는다. 또, 0으로 시작하는 정수는 주어지지 않는다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        String str = in.next();
        in.close();
        char[] array = new char[str.length()];
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (array[i] == ',') {
                cnt++;
            }
        }

        System.out.println(cnt + 1);

    }
}
