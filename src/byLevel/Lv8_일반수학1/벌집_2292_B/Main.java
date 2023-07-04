package byLevel.Lv8_일반수학1.벌집_2292_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2292
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solution(N);
    }

    private static void solution(int N) {
        // 1번째 칸 - 1
        // 2번째 칸 - 2 ~ 7
        // 3번째 칸 - 8 ~ 19
        // 4번째 칸 - 20 ~ 37
        // 1   7   19   37   61 ...
        //   6   12   18   24
        int level = 1;
        int total = 1;
        int num = 0;

        while (true) {
            if(N <= total) break;
            else{
                num += 6;
                total += num;
                level++;
            }
        }

        System.out.println(level);
    }

}
