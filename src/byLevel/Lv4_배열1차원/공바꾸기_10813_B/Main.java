package byLevel.Lv4_배열1차원.공바꾸기_10813_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10813
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] balls = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            balls[i] = i;
        }

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int tmp = balls[i];
            balls[i] = balls[j];
            balls[j] = tmp;
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < balls.length; i++) {
            sb.append(balls[i]).append(" ");
        }
        System.out.println(sb);
    }
}
