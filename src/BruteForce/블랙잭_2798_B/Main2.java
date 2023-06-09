package BruteForce.블랙잭_2798_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2798
public class Main2 {

    private static int N; // 카드의 개수
    private static int M; // 기준이 되는 합
    private static int[] cards; // 카드 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        solution(0, 0, 0);

    }

    private static int solution(int sum, int idx, int cnt) {

        if(cnt ==3) return sum > M ? 0 : sum;
        if(idx >= N) return 0;

        int max = 0;
        for (int i = idx; i < N; i++) {
            max = Math.max(max, solution(sum + cards[i], i + 1, cnt + 1));
        }

        return max;
    }
}
