/**
 * 문제 번호 : 4101번
 * 문제 제목 : 크냐?
 * 문제 내용 : 두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      if(a == 0 && b == 0) break;

      System.out.println(a > b ? "Yes" : "No");
    }
  }
}
