package byLevel.Lv8_일반수학1.달팽이는올라가고싶다_2969_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V - A) / (A - B);
        if ((V - A) % (A - B) == 0) {
            day++;
        } else {
            day++;
            day++;
        }

        System.out.println(day);
    }
}
