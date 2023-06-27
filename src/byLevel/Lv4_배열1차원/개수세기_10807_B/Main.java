package byLevel.Lv4_배열1차원.개수세기_10807_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10807
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] == v) result++;
        }
        System.out.println(result);

//      Stream을 사용해보자 -> 메모리랑 시간이 좀 더 든다.
//        long count = Arrays.stream(arr).filter(n -> n == v).count();
//        System.out.println(count);

    }
}
