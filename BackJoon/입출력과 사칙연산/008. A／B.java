/**
 * 문제 번호 : 1008번
 * 문제 제목 : A/B
 * 문제 내용 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  // 입력 데이터를 받을 스캐너 생성
  Scanner in = new Scanner(System.in);

  // 데이터를 받을 변수 생성 - 소수점까지 받아야함
  double i = in.nextDouble();
  double j = in.nextDouble();

  // 스캐너 닫기
  in.close();

  // 해당 데이터 출력
  System.out.println(i/j);

 }
}
