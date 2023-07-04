package byLevel.Lv8_일반수학1.진법변환2_11005_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11005
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int remainder;
        while (N > 0) {
            remainder = N % B;
            if (remainder >= 10) { // 10 : A, 11 : B ... Z : 35
                remainder += 55; // A-Z 만들어주기
                sb.append((char) remainder);
            } else {
                sb.append(remainder);
            }

            N /= B;
        }

        br.close();
        System.out.println(sb.reverse());
    }
}
