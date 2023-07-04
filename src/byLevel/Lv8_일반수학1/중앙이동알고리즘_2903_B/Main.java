package byLevel.Lv8_일반수학1.중앙이동알고리즘_2903_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2903
public class Main {
    public static void main(String[] args) throws IOException {
        //  4   9  25  81 ...
        // 2^2 3^2 5^2 9^2 ...
        //  한 변의 점의 개수가 2 3 5 9 ... 으로 늘어난다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int points = 2; // 힌 변의 점의 개수
        for (int i = 0; i < N; i++) {
            points = (points - 1) + points;
        }

        System.out.println((int)Math.pow(points, 2));

    }
}
