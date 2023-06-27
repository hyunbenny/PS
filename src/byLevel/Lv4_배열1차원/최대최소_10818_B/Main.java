package byLevel.Lv4_배열1차원.최대최소_10818_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10818
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            max = Math.max(tmp, max);
            min = Math.min(tmp, min);
        }

        System.out.println(min + " " + max);
    }
}
