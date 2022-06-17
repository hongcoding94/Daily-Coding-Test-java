/**
 * 문제 번호 : 2739번
 * 문제 제목 : 구구단
 * 문제 내용 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */
 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner in = new Scanner(System.in);		

		// 입력 받을 변수
		int i = in.nextInt();

		// 1부터 9까지 반복문 
		for(int j=1; j<10; ++j) {
			System.out.println(i + " * " + j + " = " + (i*j));
		}
		
		// 자원 닫기
		in.close();

	}
}
