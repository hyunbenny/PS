package byLevel.Lv3_반복문.합_8393_B;

import java.util.Scanner;

//https://www.acmicpc.net/problem/8393
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
