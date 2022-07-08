/**
 * 문제 번호 : 9093번
 * 문제 제목 : 단어 뒤집기
 * 문제 내용 : 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        String[] results = new String[t]; // 결과를 담을 배열

        for (int i = 0; i < t; i++) {
            String str = in.nextLine();
            String[] strArr = str.split(" ");
            StringBuilder result = new StringBuilder();
            for (String strs : strArr) {
                for (int j = strs.length(); j > 0; j--) {
                    result.append(strs.charAt(j-1));
                }
                result.append(" ");
            }
            results[i] = result.toString();
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
