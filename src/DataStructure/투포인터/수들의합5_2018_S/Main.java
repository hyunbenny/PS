package DataStructure.투포인터.수들의합5_2018_S;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2018
public class Main {

    public static void main(String[] args) {
        // N = 15
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 (연속된 수의 합 == 15)
        // 1+2+3+4+5 4+5+6 7+8 15

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int startIdx = 1;
        int endIdx = 1;
        int sum = 1;

        while (endIdx != N) {
            if (sum == N) {
                count++;
                endIdx++;
                sum = sum + endIdx;
            } else if (sum > N) {
                sum = sum - startIdx;
                startIdx++;
            } else {
                endIdx++;
                sum = sum + endIdx;
            }
        }

        System.out.println(count);
    }
}
