package DataStructure.배열_리스트.숫자합구하기_11720_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11720
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String number = br.readLine();

        char[] charArr = number.toCharArray();

        int sum = 0;
        for(char c : charArr)
            sum += Character.getNumericValue(c);

        System.out.println(sum);

    }

}
