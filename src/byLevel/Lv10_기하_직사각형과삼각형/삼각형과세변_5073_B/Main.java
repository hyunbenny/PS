package byLevel.Lv10_기하_직사각형과삼각형.삼각형과세변_5073_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5073
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            int max = Math.max(a, Math.max(b, c));
            if(a == max) {
                if (a >= b + c) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            }
            else if(b == max) {
                if (b >= a + c) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            }
            else {
                if (c >= a + b) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            }

            if(a == b && b == c ) sb.append("Equilateral").append("\n");
            else if((a == b && b != c) || (a == c && b != c) || (b == c && a != b)) sb.append("Isosceles").append("\n");
            else if(a != b && b != c && a != c) sb.append("Scalene").append("\n");

        }
        System.out.println(sb);
    }
}
