package byLevel.Lv10_기하_직사각형과삼각형.삼각형외우기_10101_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10101
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int sum = A + B + C;
        if(A == 60 && (A == B && B == C)) System.out.println("Equilateral");
        else if (sum == 180 && (A == B || B == C || A == C)) System.out.println("Isosceles");
        else if (sum == 180 && (A != B && B != C && A != C)) System.out.println("Scalene");
        else System.out.println("Error");
    }
}
