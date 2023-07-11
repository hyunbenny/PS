package BruteForce.분해합_2231_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2231
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;

        for (int i = 1; i < N; i++) {
            int number = solution(i);
            if (number == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);

    }

    private static int solution(int n) {
        int result = n;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
