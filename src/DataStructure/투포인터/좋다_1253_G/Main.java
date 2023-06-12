package DataStructure.투포인터.좋다_1253_G;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1253
public class Main {
    private static int N;
    private static long[] nums; // <= 1_000_000_000
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        nums = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(nums);

        System.out.println(solution());

        br.close();
    }

    private static int solution() {
        int result = 0;

        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;
            long target = nums[i];

            while (start < end) {
                if (target == nums[start] + nums[end]) {
                    if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    } else {
                        result++;
                        break;
                    }
                }

                if(nums[start] + nums[end] < target) start++;
                else if(nums[start] + nums[end] > target) end--;
            }

        }
        return result;
    }

}
