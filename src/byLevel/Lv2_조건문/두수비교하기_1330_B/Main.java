package byLevel.Lv2_조건문.두수비교하기_1330_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1330
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println((a>b)?">":(a<b)?"<":"==");
//        if(a > b) System.out.println('>');
//        else if(a < b) System.out.println('<');
//        else System.out.println("==");

    }
}
