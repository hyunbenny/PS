package byLevel.Lv9_약수배수소수.약수구하기_2501_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2501
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

/*        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if(N % i == 0) divisors.add(i);
        }

        try {
            System.out.println(divisors.get(K - 1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(0);
        }*/

        int count = 0;
        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) count++;

            if (count == K) {
                result = i;
                break;
            }
        } // for end

        System.out.println(result);
    }
}
