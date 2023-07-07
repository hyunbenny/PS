package byLevel.Lv9_약수배수소수.소수_2581_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/2581
public class Main {

    private static List<Integer> nums = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i <= N; i++) nums.add(i);
        removeNotPrimeNumber();

        int sum = nums.stream().filter(n -> n != 0).filter(n -> n >= M && n <= N).mapToInt(n -> n).sum();
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(nums.stream().filter(n -> n != 0).filter(n -> n >= M && n <= N).mapToInt(n -> n).min().getAsInt());
        }

    }

    private static void removeNotPrimeNumber() {
        nums.set(0, 0); // 0은 제외
        nums.set(1, 0); // 1은 항상 소수

        for (int i = 2; i < Math.sqrt(nums.size()); i++) {
            if (nums.get(i) == 0) continue;
            for (int j = i * i; j < nums.size(); j += i) {
                nums.set(j, 0);
            }
        }
    }
}
