/**
 * 문제 번호 : 2744번
 * 문제 제목 : 대소문자 바꾸기
 * 문제 내용 : 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main{
 public String soultion(String strChange) {
  char[] arr = strChange.toCharArray();
  String answer = "";  

  for(int i=0; i<arr.length; i++) {
	// Checkpoint1.  대문자라면 소문자로 변경
	if(Character.isUpperCase(arr[i]) == true) {
		answer += String.valueOf(Character.toLowerCase(arr[i]));
	}
	// Checkpoint2. 소문자라면 대문자로 변경
	else {
		answer += String.valueOf(Character.toUpperCase(arr[i]));
	}
  }
  return answer;
 }

 public static void main(String[] args) {
  Main M = new Main();
  Scanner in = new Scanner(System.in);

  String strChange = in.next();
  in.close();

  System.out.println(M.soultion(strChange));
 }
}
