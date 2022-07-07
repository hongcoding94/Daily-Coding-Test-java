/**
 * 문제 번호 : 10987번
 * 문제 제목 : 모음의 개수
 * 문제 내용 : 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하시오.
 */
 
 import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		for (int i= 0;i<str.length();i++) {
            // CheckPoint. 알파벳 모음을 문자 하나하나 대조하여 카운트 증가
			if (str.charAt(i) == 'a' 
                || str.charAt(i) == 'e' 
                || str.charAt(i) == 'o' 
                || str.charAt(i) == 'i' 
                || str.charAt(i) == 'u') 
				sum ++;
		}
		System.out.print(sum);
	}
}
