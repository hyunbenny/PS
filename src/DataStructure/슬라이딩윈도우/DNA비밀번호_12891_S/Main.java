package DataStructure.슬라이딩윈도우.DNA비밀번호_12891_S;

import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/12891
public class Main {

    private static int S; // 임의 DNA문자열 길이
    private static int P; // 비밀번호로 사용할 부분 문자열 길이
    private static char[] DNA; // 주어진 문자열
    private static char[] ESSENTIAL = {'A', 'C', 'G', 'T'}; // 체크할 DNA문자
    private static Map<Character, Integer> MIN_DNA = new HashMap<>(); // 포함되어야 할 최소 개수
    private static Map<Character, Integer> CHECK_DNA = new HashMap<>(); // 체크한 값을 저장할 맵
    private static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken()); // 윈도우 크기가 된다

        DNA = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < ESSENTIAL.length; i++) {
            char ch = ESSENTIAL[i];
            MIN_DNA.put(ch, Integer.parseInt(st.nextToken()));
            CHECK_DNA.put(ch, 0);
        }

        solution();
        System.out.println(result);
    }

    private static void solution() {


        // 처음 세팅
        for (int i = 0; i < P; i++) {
            char tmp = DNA[i];
            add(tmp);
        }
        check();

        int startIdx = P;
        int endIdx = DNA.length;

        for (int i = startIdx; i < endIdx; i++) {
            char add = DNA[i]; // 더할 거
            char prev = DNA[i - P]; // 뺄 거

            // 더하기
            add(add);

            // 빼기
            remove(prev);

            //확인
            check();
        }

    }

    private static void add(char add) {
        CHECK_DNA.put(add, CHECK_DNA.get(add) + 1);
    }
    private static void remove(char prev) {
        CHECK_DNA.put(prev, CHECK_DNA.get(prev) - 1);
    }

    private static void check() {

        for (char key : ESSENTIAL) {
            if(MIN_DNA.get(key) > CHECK_DNA.get(key)) return;
        }
        result++;

    }
}
