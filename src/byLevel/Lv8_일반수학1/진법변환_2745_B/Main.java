package byLevel.Lv8_일반수학1.진법변환_2745_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2745
public class Main {
    public static void main(String[] args) throws IOException {
        // 3535353535 36 == 60466175
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        int square = 0;
        int num = 0;
        for (int i = N.length() -1; i >= 0; i--) {
            char ch = N.charAt(i);
            if(ch >= '0' && ch <= '9') num = Character.getNumericValue(ch);
            else num = (ch - 'A' + 10);

            result += num * Math.pow(B, square++);
        }
        System.out.println(result);

    }
}
