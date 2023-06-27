package byLevel.Lv4_배열1차원.나머지_3052_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// https://www.acmicpc.net/problem/3052
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> nums = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            nums.add(a % 42);
        }

        System.out.println(nums.size());
    }
}
