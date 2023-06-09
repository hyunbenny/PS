package DataStructure.구간합.구간합구하기5_11660_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11660
public class Main {

    private static int N;
    private static int M;
    private static int[][] table;

    public static void main(String[] args) throws IOException {
        /**
         *    table            sumTable
         * 0 | 1 2 3 4    0 | 1    2   3   4
         * - | - - - -    - | -    -   -   -
         * 1 | 1 2 3 4    1 |  1   3   6  10
         * 2 | 2 3 4 5    2 |  3   8  15  24
         * 3 | 3 4 5 6    3 |  6  15  27  42
         * 4 | 4 5 6 7    4 | 10  24  42  64
         *
         * sumTable[2][2] = sumTable[2][1] + sumTable[1][2] - sumTable[1][1] + table[2][2]
         * = 3 + 3 - 1 + 3 = 8
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 표의 크기(N X N)
        M = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수

        table = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                table[i][j] = table[i-1][j] + table[i][j-1] - table[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = table[x2][y2] - table[x1-1][y2] - table[x2][y1-1] + table[x1-1][y1-1];
            System.out.println(result);
        }
    }
}

