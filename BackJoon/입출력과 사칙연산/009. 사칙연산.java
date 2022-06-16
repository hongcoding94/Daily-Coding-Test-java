/**
 * 문제 번호 : 10869번
 * 문제 제목 : 사칙연산
 * 문제 내용 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 */
 
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  // 입력 데이터를 받을 스캐너 생성
  Scanner in = new Scanner(System.in);

  // 데이터를 받을 변수 생성
  int i = in.nextInt();
  int j = in.nextInt();

  // 스캐너 닫기
  in.close();

  // 해당 데이터 출력
  System.out.println(i+j);
  System.out.println(i-j);
  System.out.println(i*j);
  System.out.println(i/j);
  System.out.println(i%j);
 }
}
