/**
 * 문제 제목 : 002. 대소문자 변환
 * 강의 시청 : ✔️
 */

// 강의를 보기전 내 방식 -> ✔️(Success)
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();

    in.close();
    
    for(char x : str.toCharArray()) {
        if(Character.isUpperCase(x)) {
        	System.out.print(Character.toLowerCase(x));
        } else {
        	System.out.print(Character.toUpperCase(x));
        }
    }
    
  }
}

// 강의 방법 1
import java.util.*;

public class Main {
 public String solution(String str) {
  String answer = "";
   for(char x: str.toCharArray()) {
     if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
     else answer += Character.toLowerCase(x);
       
     return answer;
   }
 }
  
 public static void main(String[] args) {
   Main T = new Main();
   Scanner kb = new Scanner(System.in);
   String str = kb.next();
   System.out.print(T.solution(str));
 }
}

/* ======================================================================== */

// 강의 방법 2 - 아스키코드로 구분

import java.util.*;
public class Main {
 public String solution(String str) {
  String answer = "";
   for(char x: str.toCharArray()) {
     if(x >= 65 && x <= 122) answer += (char)( x - 32 );
     else answer += (char)( x + 32 );
       
     return answer;
   }
 }
  
 public static void main(String[] args) {
   Main T = new Main();
   Scanner kb = new Scanner(System.in);
   String str = kb.next();
   System.out.print(T.solution(str));
 }
}
