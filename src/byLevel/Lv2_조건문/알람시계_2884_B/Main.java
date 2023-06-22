package byLevel.Lv2_조건문.알람시계_2884_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2884
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (h == 0 && m < 45) {
            System.out.println(23 + " " + (m + 15));
        }else if (m < 45){
            System.out.println((h - 1) + " " + (m + 15));
        }else{
            System.out.println(h + " " + (m - 45));
        }
    }
}
