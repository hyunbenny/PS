package BruteForce.영화감독숌_1436_S;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1436
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1666 2666 3666 4666 5666 6660 6661 6662 6663
        int count = 0;
        int number = 666;

        while (count < N) {
            if (String.valueOf(number).contains("666")) {
                count++;
            }

            number++;
        }

        System.out.println(number-1);

    }
}
