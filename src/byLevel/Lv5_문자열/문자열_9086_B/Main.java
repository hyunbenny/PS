package byLevel.Lv5_문자열.문자열_9086_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/9086
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
//            System.out.println(str.substring(0, 1) + str.substring(str.length()-1));
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }
    }
}
