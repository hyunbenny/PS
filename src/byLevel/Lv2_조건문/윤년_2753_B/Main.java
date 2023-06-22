package byLevel.Lv2_조건문.윤년_2753_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2753
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        int answer = 0;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                answer = 1;
            }
        }

        System.out.println(answer);
    }
}
