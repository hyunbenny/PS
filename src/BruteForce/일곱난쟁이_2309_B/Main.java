package BruteForce.일곱난쟁이_2309_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    // https://www.acmicpc.net/problem/2309

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] total = new int[9];
        int sum = 0;

        int fake1 = 0;
        int fake2 = 0;

        // 9명의 키를 다 더한다.
        for (int i = 0; i < total.length; i++) {
            total[i] = Integer.parseInt(br.readLine());
            sum += total[i];
        }

        Arrays.sort(total);

        // 9명 중 2명을 제외한 합이 100이 되는지 확인
        for (int i = 0; i < total.length; i++) {
            for (int j = i + 1; j < total.length; j++) {
                if (isSameAs100(sum, total[i], total[j])) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }

        // 가짜 2개의 값을 제외한 나머지를 출력한다.
        for (int i = 0; i < total.length; i++) {
            if(i == fake1 || i == fake2) continue;
            System.out.println(total[i]);
        }

    }

    private static boolean isSameAs100(int sum, int i, int j) {
        return (sum - i - j) == 100;
    }
}
