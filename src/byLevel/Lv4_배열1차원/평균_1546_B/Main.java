package byLevel.Lv4_배열1차원.평균_1546_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1546
public class Main {
    /**
     * 3, 40 80 60 -> 75.0
     * 3, 10 20 30 -> 66.666667
     * 4, 1 100 100 100 -> 75.25
     * 5, 1 2 4 8 16 -> 38.75
     * 9, 10 20 30 40 50 60 70 80 90 -> 55.55555555555556
     *
     * 점수 / 최고점 * 100
     * 40/80 * 100 = 50
     * 80/80 * 100 = 100
     * 60/80 * 100 = 75
     *
     * (40 / 80 * 100) + (80 / 80 * 100) + (60 / 80 * 100) / 3 = 75
     * ->(40 + 80 + 60) / 80 * 100 / 3
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            if(score > max) max = score;
            sum += score;
        }

        double answer = sum / (double) max * 100 / (double) N;
        System.out.println(answer);
    }
}
