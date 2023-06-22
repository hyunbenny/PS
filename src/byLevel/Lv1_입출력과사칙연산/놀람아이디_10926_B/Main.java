package byLevel.Lv1_입출력과사칙연산.놀람아이디_10926_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10926
public class Main {
    private static final String SUPRISED = "??!";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        System.out.println(id.concat(SUPRISED));
    }
}
