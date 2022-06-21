/**
 * 문제 번호 : 10818번
 * 문제 제목 : 최소, 최대
 * 문제 내용 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {  

	//	스캐너 생성
    Scanner in = new Scanner(System.in);
    
    // 변수 생성 및 arrays생성
    int i = in.nextInt();
	int arr[] = new int[i];

	// "i"만큼 배열에 데이터 넣기
    for(int j=0; j<arr.length; j++) {
    	arr[j] = in.nextInt();
    }
    
    // 자원 닫기
    in.close();
      
    // 배열에 들어간 숫자 정렬 - sort
    Arrays.sort(arr);
    
    // 0은 최소값이며 -1은 최대값으로 표기 된다.
    System.out.println(arr[0] + " " + arr[ i - 1 ]);
    
  }  
}  

