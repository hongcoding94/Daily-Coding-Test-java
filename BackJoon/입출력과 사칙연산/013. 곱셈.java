/**
 * 문제 번호 : 2588번
 * 문제 제목 : 곱셈
 * 문제 내용 : (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *                                                         472        - (1)
 *                                                       x 385        - (2)
 *                    -----------------------------------------------------
 *                                                        2360        - (3)
 *                                                       3776         - (4)
 *                                                      1416          - (5)
 *                    -----------------------------------------------------
 *                                                      181720        - (6)
 *             (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  // 입력 데이터를 받을 스캐너 생성
  Scanner in = new Scanner(System.in);

  // 데이터 입력 변수 
  int i = in.nextInt(); // 472
  int j = in.nextInt(); // 385

  // 스캐너 닫기
  in.close();
 
  // 내용 출력
  System.out.println(i*(j%10));
  System.out.println(i*(j%100/10));
  System.out.println(i*(j/100));
  System.out.println(i*j);
 }
}
