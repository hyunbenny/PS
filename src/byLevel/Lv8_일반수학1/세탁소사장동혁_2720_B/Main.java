package byLevel.Lv8_일반수학1.세탁소사장동혁_2720_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2720
public class Main {
    // $1 == 100Cent
    // Quater = $0.25, Dime = $0.10, Nickel == $0.05, Penny == $0.01
    private static final int QUARTER = 25; //0.25 * 100
    private static final int DIME = 10; //0.1 * 100
    private static final int NICKEL = 5; // 0.05 * 100
    private static final int PENNY = 1; //0.01 * 100

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int C = Integer.parseInt(br.readLine());

            sb.append(C / QUARTER).append(" ");
            C %= QUARTER;

            sb.append(C / DIME).append(" ");
            C %= DIME;

            sb.append(C / NICKEL).append(" ");
            C %= NICKEL;

            sb.append(C / PENNY).append(" ");
            C %= PENNY;

            sb.append("\n");
        }

        System.out.println(sb);

    }

}
