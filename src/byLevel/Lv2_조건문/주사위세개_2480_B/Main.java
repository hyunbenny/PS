package byLevel.Lv2_조건문.주사위세개_2480_B;

//https://www.acmicpc.net/problem/2480

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());

        if(first == second && first == third) System.out.println(10000 + first * 1000);
        else if(first == second || first == third) System.out.println(1000 + first * 100);
        else if(second == third)  System.out.println(1000 + second * 100);
        else System.out.println(Math.max(first, Math.max(second, third)) * 100);
        
    }
}
