/**
 * 문제 번호 : 10809번
 * 문제 제목 : 알파벳 찾기
 * 문제 내용 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
 *               포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
 
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
    	// 스캐너 생성
        Scanner in = new Scanner(System.in);
        
        // 변수 담기
        String str = in.nextLine();
        // String str = "baekjoon";
        
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
      	// 스캐너 닫기
        in.close();
        
        // System.out.println(" == 테스트 == ");
       	
        // 로직
        for(char x : alphabet) {
        	// System.out.println(x);
            System.out.println(str.indexOf(x));
        }
        
    }
}
