package byLevel.Lv7_2차원배열.최대값_2566_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2566
public class Main {
    public static void main(String[] args) throws IOException {
//        int[][] arr = new int[9][9];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max = Integer.MIN_VALUE;
        int resultI = 0;
        int resultJ = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp > max) {
                    max = tmp;
                    resultI = i + 1;
                    resultJ = j + 1;
                }

//                arr[i][j] = tmp;
            }
        }

        System.out.println(max);
        System.out.println(resultI + " " + resultJ);
    }
}
