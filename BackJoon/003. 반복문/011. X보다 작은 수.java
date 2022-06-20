/**
 * 문제 번호 : 10871번
 * 문제 제목 : X보다 작은 수 
 * 문제 내용 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 
 *             작은 수를 모두 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner in = new Scanner(System.in);
		
		// 전역 변수 생성
		int i = in.nextInt(); // 최대 받을 길이
		int j = in.nextInt(); // 낮은 값 찾는 기준

		// 데이터 받을 arrayList 길이 생성
		int arr[] = new int[i];

		// 로직
		for (int k = 0; k < i; k++) {
			arr[k] = in.nextInt();
		}
 
		// 자원 닫기
		in.close();
        
		for (int k = 0; k < i; k++) {
			if (arr[k] < j) {
				System.out.print(arr[k] + " ");
			}
		}
	}
}
