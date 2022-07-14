/**
 * 문제 번호 : 1783번
 * 문제 제목 : 병든 나이트
 * 문제 내용 : 병든 나이트가 N × M 크기 체스판의 가장 왼쪽아래 칸에 위치해 있다. 병든 나이트는 건강한 보통 체스의 나이트와 다르게 4가지로만 움직일 수 있다.
 *               2칸 위로, 1칸 오른쪽
 *               1칸 위로, 2칸 오른쪽
 *               1칸 아래로, 2칸 오른쪽
 *               2칸 아래로, 1칸 오른쪽
 *               병든 나이트는 여행을 시작하려고 하고, 여행을 하면서 방문한 칸의 수를 최대로 하려고 한다. 병든 나이트의 이동 횟수가 4번보다 적지 않다면, 이동 방법을 모두 한 번씩 사용해야 한다. 이동 횟수가 4번보다 적은 경우(방문한 칸이 5개 미만)에는 이동 방법에 대한 제약이 없다.
 *
 *               체스판의 크기가 주어졌을 때, 병든 나이트가 여행에서 방문할 수 있는 칸의 최대 개수를 구해보자.
 */

import java.util.Scanner;

public class Main {
	/**
	 *
	 * 문제 이해(?)
	 * - 1번. 2칸 위로, 1칸 오른쪽
	 * - 2번. 1칸 위로, 2칸 오른쪽
	 * - 3번. 1칸 아래로, 2칸 오른쪽
	 * - 4번. 2칸 아래로, 1칸 오른쪽
	 *
	 * - "다섯번 째 움직임 부터는 1번 조건부터 4번 조건" 실행(?) -> 이게 맞나?
	 */

	public static void main(String[] args) {
		Main M = new  Main();
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // 세로
		int m = in.nextInt(); // 가로

		in.close();
		System.out.println(M.solution(n, m));

	}

	public int solution(int n, int m) {
		int answer = 0;

		// CheckPoint1. 1줄에서는 이동 할 수 없다.
        if (n == 1) {
            answer = 1;
        }
        /** CheckPoint2. 2줄에서는 옆으로 이동 가능하다.
         *  case1. 2번
         *  case2. 3번
         */
        else if (n == 2) {
            answer = Math.min(4, (m + 1) / 2);
        }
        /** CheckPoint3. 3줄이상일 경우(?)
         *  case1. 1번
         *  case2. 2번
         *  case3. 3번
         *  case4. 4번
         */
        else {
        	/// CheckPoint3-1. 높이 7이상 올라가게 될 경우
            if (m < 7) {
                answer = Math.min(4, m);
            }
            // CheckPoint3-2. 5회 이상임으로 모든 조건을 수행하여야 하기 때문에 칸 소비가 많이(비효율적) 든다
            else {
                answer = m - 2;
            }
        }
		return answer;
	}
}
