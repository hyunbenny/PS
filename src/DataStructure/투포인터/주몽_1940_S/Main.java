package DataStructure.투포인터.주몽_1940_S;

// https://www.acmicpc.net/problem/1940

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int N; // 재료의 개수
    private static int M; // 갑옷을 만드는데 필요한 재료의 수
    private static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution());

    }

    private static int solution() {
        int count = 0;
        int startIdx = 0;
        int endIdx = N -1;

        // 시작 전 오름차순 정렬이 된 상태이어야 함.
        Arrays.sort(nums);

        while (startIdx < endIdx) {
            int sum = nums[startIdx] + nums[endIdx];

            if (sum > M) endIdx--;
            else if(sum < M) startIdx++;
            else {
                count++;
                startIdx++;
                endIdx--;
            }
        }
        return count;
    }
}
