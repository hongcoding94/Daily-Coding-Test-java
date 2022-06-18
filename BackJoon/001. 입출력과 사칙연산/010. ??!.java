/**
 * 문제 번호 : 10926번
 * 문제 제목 : ??!
 * 문제 내용 : 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 
 *             준하는 놀람을 ??!로 표현한다. 
 *             준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 
 *             놀람을 표현하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  // 입력 데이터를 받을 스캐너 생성
  Scanner in = new Scanner(System.in);
  
  // 데이터 담기
  String str = in.nextLine();
    
  // 해당 데이터 출력
  System.out.println(str+"??!");

  // 스캐너 닫기
  in.close();
 }
}
