package byLevel.Lv9_약수배수소수.배수와약수_5086;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5086
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(solution(a, b));
        }
    }

    private static String solution(int a, int b) {
        String result = "";
        if(b % a == 0) result = "factor";
        else if(a % b == 0) result = "multiple";
        else result = "neither";

        return result;
    }


}
