package byLevel.Lv3_반복문.코딩은체육과목입니다_25314_B;

import java.util.Scanner;

//https://www.acmicpc.net/problem/25314
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N / 4; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb);
    }
}
