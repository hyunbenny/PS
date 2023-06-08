package DataStructure.구간합.구간합구하기_11659_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11659
public class Main {
    public static void main(String[] args) throws IOException {

        // 5 4 3 2 1
        // 2 4 -> 9

        // 구간합
        // 0 5 9 12 14 15
        // 2 4 -> 14 - 5 = 9

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 주어지는 숫자의 개수
        int M = Integer.parseInt(st.nextToken()); // 구해야 하는 구간합의 횟수

        // N개의 수를 받아 누적합을 배열에 저장하기
        st = new StringTokenizer(br.readLine());
        int[] nums = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            nums[i] = nums[i - 1] + Integer.parseInt(st.nextToken());
        }

        // M번 입력받는 구간에 대해서 합 구하기
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(nums[j] - nums[i - 1]);
        }

    }
}
