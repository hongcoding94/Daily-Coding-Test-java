/**
 * 문제 번호 : 15596번
 * 문제 제목 : 정수 N개의 합
 * 문제 내용 : 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 */

public class Test {
    long sum(int[] a) {
        long ans = 0;

		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
    
        return ans;
    }
}
