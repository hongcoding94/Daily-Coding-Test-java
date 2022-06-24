/**
 * 문제 제목 : 004. 단어 뒤집기
 * 강의 시청 : ✔️
 */

// 강의를 보기전 내 방식 -> ✔️(Success)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    // 스캐너 생성
		Scanner in = new Scanner(System.in);

		// 변수 
		int cnt = in.nextInt();
 
 		for(int i=0; i<cnt; i++) {
          String str = in.next();
          char[] arr = str.toCharArray();
        
          char[] output = new char[arr.length];
          int lndex = 0;

          for (int j = arr.length-1; j >= 0; j--) {
              output[lndex++] = arr[j];
          }

          String answer = new String(output);
          System.out.println(answer); 
		}
        
    // 스캐너 닫기
    in.close();
	}
}

// 강의 방법 1
public class Main{
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main2 T = new Main();
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String s : T.solution(n, str)) {
            System.out.println(s);
        }
    }
}

/* ======================================================================== */

// 강의 방법 2
public class Main{
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // 특정문자만 뒤집을 때,
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt<rt) { // 짝수길이일 경우 lt가 rt보다 커지므로 이때 종료함. 홀수길이는 같아짐
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main3 T = new Main();
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String s : T.solution(n, str)) {
            System.out.println(s);
        }
    }
}
