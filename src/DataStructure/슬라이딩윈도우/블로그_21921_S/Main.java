package DataStructure.슬라이딩윈도우.블로그_21921_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21921
public class Main {
    private static int N; // 블로그 시작한 후부터 일수
    private static int X; // 방문자 수를 구할 기간
    private static int[] visitCountArr;
    private static int maxVisit = 0;
    private static int maxPeriodCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        visitCountArr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            visitCountArr[i] = Integer.parseInt(st.nextToken());
        }

        solution();
    }

    private static void solution() {
        // 처음 합계를 먼저 계산한다.
        for (int i = 0; i < X; i++) {
            maxVisit += visitCountArr[i];
        }
        maxPeriodCnt++;

        int sum = maxVisit;
        for (int i = X; i < N; i++) {
            sum += visitCountArr[i] - visitCountArr[i - X];
            if (sum > maxVisit) {
                maxPeriodCnt = 1;
                maxVisit = sum;
            } else if (sum == maxVisit) {
                maxPeriodCnt++;
            }
        }

        if (maxVisit == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxVisit);
            System.out.println(maxPeriodCnt);
        }

    }
}
