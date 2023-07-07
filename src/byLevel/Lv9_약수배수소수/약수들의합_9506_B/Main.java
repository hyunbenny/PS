package byLevel.Lv9_약수배수소수.약수들의합_9506_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/9506
public class Main {

    private static final String IS_NOT_PERFECT = " is NOT perfect.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = sc.nextInt();
            if(n == -1) break;

            int sum = 0;
            List<Integer> divisors = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    divisors.add(i);
                }
            }

            if (n != sum) {
                sb.append(n).append(IS_NOT_PERFECT).append("\n");
            } else {
                sb.append(n).append(" =");
                for (int i = 0; i < divisors.size(); i++) {
                    if (i == divisors.size() - 1) sb.append(" ").append(divisors.get(i)).append("\n");
                    else sb.append(" ").append(divisors.get(i)).append(" +");
                }
            }

        } // while end
        System.out.println(sb);
    }
}
