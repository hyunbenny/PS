package byLevel.Lv6_심화1.너의평점은_25206_S;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/25206
public class Main {

    private static final int SUBJECT_NUMS = 20;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double creditSum = 0.0;
        double gradeSum = 0.0;
        for (int i = 0; i < SUBJECT_NUMS; i++) {
            st = new StringTokenizer(br.readLine());
            String subjectName = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            } else {
                double gradeAsNum = convertGradeStringToNumber(grade);
                creditSum += credit;
                gradeSum += credit * gradeAsNum;
            }
        }

        System.out.println(gradeSum / creditSum);


    }

    private static double convertGradeStringToNumber(String grade) {

        double converted = 0;
        switch (grade) {
            case "A+" :
                converted = (double) 4.5;
                break;
            case "A0" :
                converted = (double) 4.0;
                break;
            case "B+" :
                converted = (double) 3.5;
                break;
            case "B0" :
                converted = (double) 3.0;
                break;
            case "C+" :
                converted = (double) 2.5;
                break;
            case "C0" :
                converted = (double) 2.0;
                break;
            case "D+" :
                converted = (double) 1.5;
                break;
            case "D0" :
                converted = (double) 1.0;
                break;
            case "F" :
                converted = (double) 0.0;
                break;
        }

        return converted;
    }
}
