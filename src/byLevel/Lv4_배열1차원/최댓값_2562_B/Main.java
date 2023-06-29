package byLevel.Lv4_배열1차원.최댓값_2562_B;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2562
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 1; i <= 9; i++) {
            int tmp = sc.nextInt();

            if(tmp > max){
                max = tmp;
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
