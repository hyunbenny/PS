package byLevel.Lv6_심화1.그룹단어체커_1316_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if(solution(br.readLine())) result++;
        }

        System.out.println(result);
    }

    private static boolean solution(String str) {
        // cc a zzzz bb -> O
        // k i n -> O
        // aa bbb cc b -> X
        boolean isConsecutiveWord = true;
        boolean[] isChecked = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (isChecked[index]) {
                // 이전에 나왔던 값인데 지금 문자와 이전 문자가 다르다? -> 이미 나왔던 문자가 한 번 더 나왔다
                // 같은 문자면 뭐.. 그냥 넘어가면 됨
                if (str.charAt(i) != str.charAt(i - 1)) {
                    isConsecutiveWord = false;
                    break;
                }
            } else {
                // 체크가 안되어 있으면 한번도 안나왔던 문자 -> 나온 걸로 체크
                isChecked[index] = true;
            }


        }
        return isConsecutiveWord;

    }
}
