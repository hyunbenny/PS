package byLevel.Lv5_문자열.상수_2908_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2908
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        System.out.println(Math.max(convert(A), convert(B)));

    }

    private static int convert(String str) {
        char[] arr = str.toCharArray();
        int length = str.length();

        StringBuilder sb = new StringBuilder();
        for (int i = length-1; i >= 0; i--) {
            sb.append(Character.getNumericValue(arr[i]));
        }

        return Integer.parseInt(sb.toString());
    }
}
