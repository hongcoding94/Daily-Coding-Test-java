/**
 * 문제 제목 : 001. 문자 찾기
 * 강의 시청 : ✔️
 */

// 강의를 보기전 내 방식 -> ✔️(Success)
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	// 스캐너 생성
    Scanner in = new Scanner(System.in);
    
    // 변수
    String str = in.next().toUpperCase();                  //("Computercooler").toUpperCase(); 
    char c = Character.toUpperCase((in.next()).charAt(0)); // Character.toUpperCase(("c").charAt(0));
    int cnt = 0;
    
    // 스캐너 닫기
    in.close();
    
    for(char x : str.toCharArray()) {
    	if(x==c) cnt++;
    }
    
    System.out.println(cnt);
    
  }
}

// 강의 방법 1
import java.util.Scanner;
  
public class Main {
  public int solution(String str, char t) {
   int answer = 0;
   str = str.toUpperCase();
   t = Character.toUpperCase(t);
   // System.out.println(str+ " "+t);
    
   for(int i=0; i<str.length(); i++) {
     if(str.charAt(i)==t) answer++;
   }
    
   return answer;
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in = new Scanner(System.in);
    String str = in.next();
    char c = in.next().charAt(0);
    System.out.print(T.solution(str,c));
  }
}

/* ======================================================================== */

// 강의 방법 2
import java.util.Scanner;
  
public class Main {
  public int solution(String str, char t) {
   int answer = 0;
   str = str.toUpperCase();
   t = Character.toUpperCase(t);
   for(char x : str.toCharArray()) {
    if(x==t) answer++; 
   }
    
   return answer;
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in = new Scanner(System.in);
    String str = in.next();
    char c = in.next().charAt(0);
    System.out.print(T.solution(str,c));
  }
}
