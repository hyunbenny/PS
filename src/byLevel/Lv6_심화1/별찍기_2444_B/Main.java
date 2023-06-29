package byLevel.Lv6_심화1.별찍기_2444_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2444
public class Main {

    /**
     *     *
     *    ** *
     *   *****
     *  *******
     * *********
     *  *******
     *   *****
     *    ***
     *     *
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 1 3 5 7 9 7 5 3 1
        // 1: 공백 4칸 별 1칸
        // 2: 공백 3칸 별 3칸
        // 3: 공백 2칸 별 5칸
        // 4: 공백 1칸 별 7칸
        // 5: 공백 0칸 별 9칸 ...

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }

        for (int i = N-1; i >= 1; i--) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
