import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalResult = 0; // 총 학점
        double sumOfScore = 0;  // 이수한 과목의 단위 수
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명 날려버려
            double score = Double.parseDouble(st.nextToken()); // 단위수
            sumOfScore += score;
            String grade = st.nextToken(); // 과목의 학점 (A+)

            if (grade.equals("A+")) {
                totalResult += score * 4.5;
            } else if (grade.equals("A0")) {
                totalResult += score * 4;
            } else if (grade.equals("B+")) {
                totalResult += score * 3.5;
            } else if (grade.equals("B0")) {
                totalResult += score * 3;
            } else if (grade.equals("C+")) {
                totalResult += score * 2.5;
            } else if (grade.equals("C0")) {
                totalResult += score * 2;
            } else if (grade.equals("D+")) {
                totalResult += score * 1.5;
            } else if (grade.equals("D0")) {
                totalResult += score * 1;
            } else if (grade.equals("F")) {
                totalResult += score * 0;
            } else if (grade.equals("P")) {
                sumOfScore -= score;
            }
//            switch (grade) { // Java 11에서는 지원하지 않음.
//                case "A+" -> totalResult += score * 4.5;
//                case "A0" -> totalResult += score * 4.0;
//                case "B+" -> totalResult += score * 3.5;
//                case "B0" -> totalResult += score * 3.0;
//                case "C+" -> totalResult += score * 2.5;
//                case "C0" -> totalResult += score * 2.0;
//                case "D+" -> totalResult += score * 1.5;
//                case "D0" -> totalResult += score;
//                case "F" -> totalResult += score * 0;
//                case "P" -> sumOfScore -= score;
//            }
        }
        System.out.println(totalResult / sumOfScore);
    }
}
