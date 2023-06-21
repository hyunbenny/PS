package DataStructure.큐.카드2_2164_S;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2164
public class Main {
    private static int N;
    private static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        System.out.println(solution());
    }


    private static int solution() {
        while (q.size() > 1) { // 마지막 하나 남을때까지
            q.poll();
            Integer moveToBottom = q.poll();
            q.add(moveToBottom);
        }

        return q.poll();
    }
}
