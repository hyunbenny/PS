package DataStructure.슬라이딩윈도우.귀여운라이언_15565_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15565
// 슬라이딩 윈도우
public class Main {
    private static int N; // 인형 개수
    private static int K; // 구할 연속된 인형 집합의 크기(-> 라이언이 K개인 집합의 크기를 구해야 한다.)
    private static int[] DOLLS; // 라이언 : 1, 어피치 : 2
    private static ArrayList<Integer> RYAN_IDX = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        DOLLS = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            DOLLS[i] = Integer.parseInt(st.nextToken());
            if(DOLLS[i] == 1) RYAN_IDX.add(i);
        }

        System.out.println(solution());
    }

    private static int solution() {
        // 라이언 인형이 K개 이상 있는 가장 작은 연속된 인형 집합의 크기
        // 1 <= K <= N <= 10^6

        if(RYAN_IDX.size() < K) return -1;

        int startIdx = 0;
        int endIdx = K -1;
        int length = Integer.MAX_VALUE;

        while (true) {
            if(endIdx == RYAN_IDX.size()) break;

            int tmpLength = RYAN_IDX.get(endIdx) - RYAN_IDX.get(startIdx) + 1;
            length = Math.min(length, tmpLength);

            startIdx++;
            endIdx++;
        }
        return length;

    }
}
