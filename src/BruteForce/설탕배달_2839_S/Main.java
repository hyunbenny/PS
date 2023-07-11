package BruteForce.설탕배달_2839_S;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2839
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;

        while (true) {
            if (N % 5 == 0) {
                count += N / 5;
                break;
            } else {
                N -= 3;
                count++;
            }

            if (N < 0) {
                count = -1;
                break;
            }

        }

        System.out.println(count);
    }
}
