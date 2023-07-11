package BruteForce.체스판다시칠하기_1018_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1018
public class Main {

    private static boolean[][] board;
    private static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                if(line.charAt(j) == 'W') board[i][j] = true;
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                solution(i, j);
            }
        }
        System.out.println(min);
    }

    private static void solution(int startX, int startY) {
        int endX = startX + 8;
        int endY = startY + 8;
        
        int cnt = 0;

        boolean isWhite = board[startX][startY];

        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                if(board[i][j] != isWhite) cnt++;
                isWhite = !isWhite; // 다음 칸을 체크를 위해서 색을 바꿔줌
            }
            isWhite = !isWhite;
        }

        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }
}
