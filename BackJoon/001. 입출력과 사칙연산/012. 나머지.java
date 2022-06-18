/**
 * 문제 번호 : 10430번
 * 문제 제목 : 나머지
 * 문제 내용 : (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 *             (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 *             세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  // 입력 데이터를 받을 스캐너 생성
  Scanner in = new Scanner(System.in);

  // 데이터 변수 
  int i = in.nextInt();
  int j = in.nextInt();
  int k = in.nextInt();

  // 스캐너 닫기
  in.close();

  // 내용 출력
  System.out.println((i + j) % k);
  System.out.println(((i % k) + (j % k)) % k);
  System.out.println((i * j) % k);
  System.out.println(((i % k) * (j % k)) % k);
 }
}
