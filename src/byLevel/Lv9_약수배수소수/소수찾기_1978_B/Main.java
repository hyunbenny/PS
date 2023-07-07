package byLevel.Lv9_약수배수소수.소수찾기_1978_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1978
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num != 1 && isPrimeNumber(num)) count++;
        }

        System.out.println(count);
    }

    private static boolean isPrimeNumber(int number) {
        boolean result = true;
        for (int i = 1; i <= number; i++) {
            if (i != 1 && i != number) {
                if(number % i == 0){
                    result = false;
                    break;
                }

            }
        }

        return result;
    }
}
