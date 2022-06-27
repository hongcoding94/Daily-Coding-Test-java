/**
 * 문제 번호 : 10757번
 * 문제 제목 : 큰 수 A+B
 * 문제 내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
    	// 스캐너 생성
		Scanner in = new Scanner(System.in);
        
        // 해당 데이터 넣기
		BigInteger bigNumberA = new BigInteger(in.next());
        BigInteger bigNumberB = new BigInteger(in.next());
        
        // 스캐너 닫기
        in.close();
        
        System.out.println(bigNumberA.add(bigNumberB));
	}
}
