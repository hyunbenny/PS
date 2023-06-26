package byLevel.Lv3_반복문.빠른APlusB_15552_B;

import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15552
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = a + b;
            bw.write(result + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
