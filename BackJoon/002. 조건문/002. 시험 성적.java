/**
 * 문제 번호 : 9498번
 * 문제 제목 : 시험 성적
 * 문제 내용 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 
 *   	       60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
 
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  // 입력 데이터를 받을 스캐너 생성
  Scanner in = new Scanner(System.in);

  // 데이터 입력 변수 
  int i = in.nextInt();

  // 스캐너 닫기
  in.close();
 
  // 내용 출력
  if(i >= 90 ) {
	System.out.println("A");
  } else if(i >= 80 ) {
	System.out.println("B");
  } else if(i >= 70 ) {
	System.out.println("C");
  } else if(i >= 60 ) {
	System.out.println("D");
  } else {
	System.out.println("F");
  }
 }
}
