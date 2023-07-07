package byLevel.Lv9_약수배수소수.소인수분해_11653_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11653
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 2;
        while (true) {
            if(N == 1) break;
            if (N % i == 0) {
                N /= i;
                System.out.println(i);
            } else {
                i++;
            }
        }
    }
}
