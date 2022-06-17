/**
 * 문제 번호 : 1330번
 * 문제 제목 : 두 수 비교하기
 * 문제 내용 : ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 
 *            이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 왠지 모르게 올해에도 파주 World Finals 준비 캠프에 참여했다.
 *            대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.
 */
 
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  // 입력 데이터를 받기 위해서 스캐너 생성
  Scanner in = new Scanner(System.in);

  // 입력 데이터의 변수 생성
  int i = in.nextInt();
  int j = in.nextInt();

  // 사용한 자원 닫기
  in.close();

  // 삼항연산자   
  String msg = (i>j) ? ">" : ((i<j) ? "<" : "==");
  System.out.println(msg);
 }
}
