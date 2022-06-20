/**
 * 문제 번호 : 15552번
 * 문제 제목 : 빠른 A+B
 * 문제 내용 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
 *             다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 *
 * ┌──────────────────────────────────────────────────────────────────────────────────┐
 * │                              ** Critical Warning **                              │  
 * │ 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점         │
 * │ Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와         │
 * │ BufferedWriter를 사용할 수 있다.                                                  │
 * │ BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.                              │
 * └──────────────────────────────────────────────────────────────────────────────────┘
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    	// 버퍼 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 		// 변수 생성
		int i = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
 		// 로직
		for (int j = 0; j <i; j++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}

		// 자원 닫기
		br.close();
		bw.flush();
		bw.close();
 
	}
}
