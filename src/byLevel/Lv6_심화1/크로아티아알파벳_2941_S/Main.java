package byLevel.Lv6_심화1.크로아티아알파벳_2941_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2941
public class Main {
    public static void main(String[] args) throws IOException {
        String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i = 0; i < croatiaAlphabets.length; i++) {
            if(input.contains(croatiaAlphabets[i])) input = input.replace(croatiaAlphabets[i], "0");
        }

        System.out.println(input.length());

    }
}
