/**
 * 문제 번호 : 11382번
 * 문제 제목 : 꼬마 정민
 * 문제 내용 : 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 */

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer in = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(in.nextToken());
        BigInteger B = new BigInteger(in.nextToken());
        BigInteger C = new BigInteger(in.nextToken());
        bw.write(A.add(B.add(C)) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
