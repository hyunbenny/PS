package byLevel.Lv5_문자열.알파벳찾기_10809_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/10809
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S = br.readLine().toCharArray();

        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        for (int i = 0; i < S.length; i++) {
            int idx = calcIndex(S[i]);
            if(alphabets[idx] == -1) alphabets[idx] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabets.length; i++) {
            sb.append(alphabets[i]).append(" ");
        }
        System.out.println(sb);
    }

    private static int calcIndex(int word) {
        // 인덱스 : 0 ~ 25
        // a ~ z : 97 ~ 122
        return word - 97;
    }
}
