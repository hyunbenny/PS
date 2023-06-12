package DataStructure.투포인터.수들의합2_2003_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2003
public class Main {
    private static int N;
    private static int M;
    private static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }

        nums = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution());
    }

    private static int solution() {
        int result = 0;
        int start = 0;
        int end = 0;
        int sum = 0;

        while (start < N) {
            if (sum > M || end == N) {
                sum -= nums[start];
                start++;
            }else{
                sum += nums[end];
                end++;
            }

            if(sum == M) result++;
        }

        return result;
    }
}
