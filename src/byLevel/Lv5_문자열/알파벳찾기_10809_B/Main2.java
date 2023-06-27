package byLevel.Lv5_문자열.알파벳찾기_10809_B;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String S = new Scanner(System.in).next();
        for (char c = 'a'; c <= 'z'; c++) {
            int i = S.indexOf(c);
            System.out.print(S.indexOf(c) + " ");
        }

    }
}
