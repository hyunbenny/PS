package byLevel.입출력과사칙연산.불기연도구하기_18108_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/18108
public class Main {

    private static int N;
    private static final int GAP = 543;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        System.out.println(solution());
    }

    private static int solution() {
        return N - GAP;
    }
}
