package byLevel.Lv5_문자열.숫자의합_11720_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11720
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] nums = br.readLine().toCharArray();

        int sum = 0;
        for (char ch : nums) {
            sum += Character.getNumericValue(ch);
        }
        System.out.println(sum);
    }
}
