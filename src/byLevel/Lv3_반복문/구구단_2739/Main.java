package byLevel.Lv3_반복문.구구단_2739;


import java.util.Scanner;

// https://www.acmicpc.net/problem/2739
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(String.format("%d * %d = %d", n, i, n*i));
        }
    }
}
