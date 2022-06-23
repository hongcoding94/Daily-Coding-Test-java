/**
 * 문제 제목 : 003. 문장 속 단어
 * 강의 시청 : ✔️
 */

// 강의를 보기전 내 방식 -> 🔺(Half Success)
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  	
    // 스캐너 생성
    Scanner in = new Scanner(System.in);
    // String str = in.nextLine();
    
    // 필요한 변수 생성
	String str = "it is time to study";
    String arraysStr[] = str.split(" ");
    int min = Integer.MIN_VALUE;
    String an = null;
  
  	// 스캐너 닫기
    in.close();
    
    
  // 로직 전에 테스트
  // System.out.println(str.length()); 19개
    
  //로직 - 첫 줄에 가장 긴 단어를 출력
	//       길이가 동일하다면 문장 속 앞에 단어 출력

	// System.out.println(arraysStr.length);

        for(String x : arraysStr) {
        	// System.out.println(x);
        	int len = x.length();
            
            if(len > min) {
            	min = len;
                an = x;
            }
        }
		System.out.println(an);
	}
}

// 강의 방법 1
import java.util.*;

public class Main{
	public String solution(String str) {
    	String answer = "";
        int m = Integer.MIN_VALUE;
        
        String[] s = str.split(" ");
        for(String x : s) {
        	// System.out.println(x);
        	int len = x.length();
            
            if(len > m) {
            	m = len;
                answer = x;
            }
        }
        return answer;
    }
    
    public static void  main(String[] args) {
    	Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
	}
}

/* ======================================================================== */

// 강의 방법 2 - indexOf사용
import java.util.*;

public class Main{
	public String solution(String str) {
    
    	String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1) {
        	String tmp = str.substring(0,pos);
            int len = tmp.length();
            
            if(len > m) {
            	m = len;
                answer = tmp;
            }
        	str = str.substring(pos+1);
        }
        if(str.length() > m) answer = str; 
        return answer;
    }
    
    public static void  main(String[] args) {
        Main T = new Main();
        Scanner kb= new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
	}
}
