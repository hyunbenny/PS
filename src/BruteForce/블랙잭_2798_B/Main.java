package BruteForce.블랙잭_2798_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2798
public class Main {

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

        System.out.println(solution());

    }

    private static int solution() {
        int result = 0;
        int sum = 0;

        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if(sum == M) return sum;
                    if(sum < M && result < sum) result = sum;
                }
            }
        }
        return result;
    }
}
