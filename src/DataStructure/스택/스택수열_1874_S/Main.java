package DataStructure.스택.스택수열_1874_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

// https://www.acmicpc.net/problem/1874
public class Main {
    private static int N;
    private static int[] NUMS;
    private static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        NUMS = new int[N];
        for (int i = 0; i < N; i++) {
            NUMS[i] = Integer.parseInt(br.readLine());
        }

        solution();
        System.out.println(sb.toString());

        br.close();
    }

    private static void solution() {
        Stack<Integer> stack = new Stack();

        int cursor = 1;

        for (int i = 0; i < NUMS.length; i++) {
            int num = NUMS[i];
            // 배열에서 읽은 값이 커서보다 크면 스택에 넣는다.(다 넣고 제일 위의 수는 꺼낸다.)
            if (num >= cursor) {
                while (num >= cursor) {
                    stack.push(cursor++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            // 작으면 그냥 꺼내면 되는데 배열에서 읽은 수가 스택에서 꺼낸 수보다 크면 더 이상 수열을 만들 수 없음 -> NO 리턴
            } else {
                int popNum = stack.pop();

                if (popNum > num) {
                    sb.delete(0, sb.length());
                    sb.append("NO");
                    return;
                } else {
                    sb.append("-\n");
                }
            }
        }
    }
}
