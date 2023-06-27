package byLevel.Lv5_문자열.문자와문자열_27866_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/27866
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = sc.nextInt();
        System.out.println(str.charAt(i-1));
    }
}
