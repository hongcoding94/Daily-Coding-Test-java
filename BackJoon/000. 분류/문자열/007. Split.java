/**
 * 문제 번호 : 21955번
 * 문제 제목 : Split
 * 문제 내용 : In order to teach Mihai to write figures neatly, his teacher gave him for homework to write several numbers. Because he was rushing to finish his homework as quick as possible so that he can play on the computer, he wrote the numbers so close that some of them were attached.
 *            When his mother looked on Mihai’s notebook, she noticed this thing and she thought of a challenge for the little boy. She writes a number with an even number of digits and Mihai should split this number in two equal parts and should write the two numbers which are formed after this move.
 *            This thing will help Mihai learn how to write numbers neatly in a funny way.
 *            Help Mihai find two numbers which form the number said by his mother, if we attach the second number at the end of the first one.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main M = new Main();
		Scanner in = new Scanner(System.in);

		String X = in.nextLine();
		in.close();
		System.out.println(M.solution(X));
	}

	public String solution(String X) {
		int harp = X.length() /2;
		String answer = X.substring(0, harp) + " " + X.substring(harp, X.length()) ;
		return answer;
	}
}
