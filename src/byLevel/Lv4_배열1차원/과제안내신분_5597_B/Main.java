package byLevel.Lv4_배열1차원.과제안내신분_5597_B;

import java.util.Scanner;

// https://www.acmicpc.net/problem/5597
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 30;
        boolean[] submitted = new boolean[students + 1];

        // 제출한 학생 수는 28명
        for (int i = 1; i <= 28; i++) {
            int tmp = sc.nextInt();
            submitted[tmp] = true;
        }

        for (int i = 1; i < submitted.length; i++) {
            if(!submitted[i]) System.out.println(i);
        }

    }
}
