package byLevel.Lv6_심화1.킹퀸룩비숍나이트폰_3003_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/3003
public class Main {
    public static void main(String[] args) throws IOException {
        // 16개 풀세트 세팅
        int[] complete = {1, 1, 2, 2, 2, 8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//        int[] incomplete = new int[6];
//        for (int i = 0; i < incomplete.length; i++) {
//            int input = Integer.parseInt(st.nextToken());
//            incomplete[i] = complete[i] - input;
//        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append(complete[i] - input).append(" ");
        }

        System.out.println(sb);

    }
}
