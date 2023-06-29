package byLevel.Lv7_2차원배열.색종이_2563_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2563
public class Main {
    private static boolean[][] graph = new boolean[101][101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            coloring(x, y);
        }

        System.out.println(count());

    }

    private static void coloring(int x, int y) {
        int xTo = (x + 10) > 100 ? 100 : x + 10;
        int yTo = (y + 10) > 100 ? 100 : y + 10;


        for (int i = x; i < xTo; i++) {
            for (int j = y; j < yTo; j++) {
                graph[i][j] = true;
            }
        }
    }

    private static int count() {
        int count = 0;
        for (boolean[] booleans : graph) {
            for (boolean b : booleans) {
                if(b == true) count++;
            }
        }

        return count;
    }
}
