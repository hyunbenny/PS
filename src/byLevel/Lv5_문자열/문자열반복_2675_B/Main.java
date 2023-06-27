package byLevel.Lv5_문자열.문자열반복_2675_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2675
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            solution(R, S);
        }
    }

    private static void solution(int repeatCount, String str) {
        StringBuilder sb = new StringBuilder();
//        14064KB, 120ms
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < repeatCount; j++) {
                sb.append(str.charAt(i));
            }
        }
//      메모리는 조금 더 적게 먹지만 시간은 조금 더 걸린다 (14020KB, 124ms)
//       for (int i = 0; i < str.length(); i++) {
//            String tmp = String.valueOf(str.charAt(i)).repeat(repeatCount);
//            sb.append(tmp);
//        }

        System.out.println(sb);
    }

}
