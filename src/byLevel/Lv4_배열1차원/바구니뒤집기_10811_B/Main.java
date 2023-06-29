package byLevel.Lv4_배열1차원.바구니뒤집기_10811_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10811
public class Main {

    private static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 5 4
        // 1 2 3 4 5
        // 1 2 -> 2 1 3 4 5
        // 3 4 -> 2 1 4 3 5
        // 1 4 -> 3 4 1 2 5

        nums = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            nums[i] = i;
        }

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            convert(i, j);
        }

        for (int i = 1; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    private static void convert(int from, int to) {
        Stack<Integer> stack = new Stack<>();
        for (int i = from; i <= to; i++) {
            stack.push(nums[i]);
        }

        for (int i = from; i <= to; i++) {
            nums[i] = stack.pop();
        }

    }
}
