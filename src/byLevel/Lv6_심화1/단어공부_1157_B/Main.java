package byLevel.Lv6_심화1.단어공부_1157_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1157
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input =  br.readLine().toUpperCase();

        int[] alphabetCounts = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'A';
            alphabetCounts[index]++;
        }

        int max = Integer.MIN_VALUE;
        char answer = '?';
        for (int i = 0; i < alphabetCounts.length; i++) {
            if (max < alphabetCounts[i]) {
                max = alphabetCounts[i];
                answer = (char)(i + 'A');
            }else if(max == alphabetCounts[i]) answer = '?';
        }

        System.out.println(answer);
    }
}
