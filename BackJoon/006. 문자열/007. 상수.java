/**
 * 문제 번호 : 2908번
 * 문제 제목 : 상수
 * 문제 내용 : 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
 *             이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 
 *             그 다음에 크기가 큰 수를 말해보라고 했다.
 *             상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
 *             따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 *             두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// public int solution(String a, String b) {
    public String solution(String[] str) {
    	ArrayList<String> answer = new ArrayList<>();

    	// 변수 생성
    	char[] tempChar = null;
    	String fan = "";

    	for(String x : str) {
    		tempChar = x.toCharArray();
    		String temp = "";
    		for(int code = tempChar.length - 1; code >= 0; code--) {
    			temp += tempChar[code];
    		}
    		answer.add(temp);
    	}
    	//a > b
    	//a.compareTo(b) > 0
    	String a = answer.get(0);
    	String b = answer.get(1);

    	if(a.compareTo(b) > 0)  fan = a;
    	if(a.compareTo(b) < 0)  fan = b;

		return fan;
	}
  
	public static void main (String[] args) {

		Main S = new Main();
		Scanner in = new Scanner(System.in);

		String[] str = new String[2];
		int cnt;

		// 해당 데이터는 1:1 비교문이기 때문에 데이터 2번 반복 실행한다.
		for(cnt = 0; cnt < 2; cnt++) {
			str[cnt] = in.next();
		}

			System.out.println(S.solution(str));
	}

}
