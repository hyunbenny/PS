package DataStructure.배열_리스트.평균구하기_1546_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1546
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] scores = new int[N];

        String str = br.readLine();
        int M = 0;

        // 입력받은 점수값들을 배열에 넣고 최고점 구하기
        StringTokenizer st = new StringTokenizer(str, " ");
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if(M < scores[i]) M = scores[i];
        }

        // 평균 구하기 A
        // (A과목 점수 / M * 100 + B과목 점수 / M * 100 + C과목 점수 / M * 100) / N
        double sum_ = 0d;
        for(int score : scores){
            sum_ += Double.valueOf(score) / M * 100.0;
        }
        System.out.println(sum_ / N);

        // 평균 구하기 B
        // 합계 구하기
        // (A + B + C) * 100.0 / M / N
        int sum = 0;
        sum = Arrays.stream(scores).sum();
        System.out.println(sum * 100.0 / M / N);

    }
}
