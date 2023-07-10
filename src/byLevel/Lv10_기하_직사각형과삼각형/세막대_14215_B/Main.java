package byLevel.Lv10_기하_직사각형과삼각형.세막대_14215_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14215
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(a, Math.max(b, c));

        if(a + b + c - max > max) System.out.println(a + b + c);
        else System.out.print((a + b + c - max) * 2 - 1); // c가 제일 길다고 했을 때, a + b + (a + b -1) = 2(a + b) -1
    }
}
