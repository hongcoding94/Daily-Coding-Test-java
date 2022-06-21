/**
 * 문제 번호 : 2562번
 * 문제 제목 : 최댓값
 * 문제 내용 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 
 *             몇 번째 수인지를 구하는 프로그램을 작성하시오.
 *             예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61이
 *             주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
    
    // 스캐너 생성
    Scanner in = new Scanner(System.in);
    
    // 9개 들어가기
    int arr[] = new int[9];
    
    for(int i=0; i<arr.length; i++) {
    	arr[i] = in.nextInt();
    }
    
    // 스캐너 닫기
    in.close();
    
    // 최대값 위치값 찾기 위한 변수 선언
    int max = 0;
    int index = 0;
    
    for(int j=0; j<arr.length; j++) {
    	if(arr[j] > max) {
    		max = arr[j];
            index = j+1;
    	}
    }
    
    // 결과 출력
    System.out.println(max);
    System.out.println(index);
    
	}
}
