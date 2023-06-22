package byLevel.Lv2_조건문.사분면고르기_14681_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/14681
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // x, y는 모두 양수 혹은 음수
        if (x > 0) {
            if (y > 0) System.out.println(1);
            else System.out.println(4);
        } else {
            if(y > 0) System.out.println(2);
            else System.out.println(3);
        }
    }
}
