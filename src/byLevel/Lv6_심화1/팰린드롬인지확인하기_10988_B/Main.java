package byLevel.Lv6_심화1.팰린드롬인지확인하기_10988_B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10988
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        int isPalindrome = 1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] != input[input.length-1 - i]) {
                isPalindrome = 0;
                break;
            }
        }

        System.out.println(isPalindrome);

    }
}
