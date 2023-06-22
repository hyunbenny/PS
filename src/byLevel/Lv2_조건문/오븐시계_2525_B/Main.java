package byLevel.Lv2_조건문.오븐시계_2525_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2525
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int duration = Integer.parseInt(br.readLine());

        // 시 -> 분
        int convertToMinute = h * 60 + m;	// 현재 시간을 분으로 변경
        convertToMinute += duration;		// 요리하는데 걸린 시간 더하기

        int hour = (convertToMinute / 60) % 24;	// 시
        int minute = convertToMinute % 60;	// 분

        System.out.println(hour + " " + minute);

    }
}
