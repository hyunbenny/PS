package byLevel.Lv2_조건문.시험성적_9498_B;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9498
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        switch (score / 10) {
            case 10 :
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 6 :
                System.out.println("D");
                break;
            default :
                System.out.println("F");

        }

    }
}
