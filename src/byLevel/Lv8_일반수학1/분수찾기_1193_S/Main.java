package byLevel.Lv8_일반수학1.분수찾기_1193_S;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1193
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int i = 0; // 몇번째 행에서 구해야 하는지
        while (N > sum) {
            sum += ++i;
        }


        int j = N - (sum - i); // 행에서 몇번쨰인지
        if (i % 2 == 0) {
            System.out.println(j + "/" + (i - j + 1));
        } else {
            System.out.println((i - j + 1) + "/" + j);
        }


    }
}
