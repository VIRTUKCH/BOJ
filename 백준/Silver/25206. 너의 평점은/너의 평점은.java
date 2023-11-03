import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String subject;
        double s_unit;
        String s_grade;

        double totalUnitMulGrade = 0;
        double totalUnit = 0;

        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("A+", 4.5);
        hashMap.put("A0", 4.0);
        hashMap.put("B+", 3.5);
        hashMap.put("B0", 3.0);
        hashMap.put("C+", 2.5);
        hashMap.put("C0", 2.0);
        hashMap.put("D+", 1.5);
        hashMap.put("D0", 1.0);
        hashMap.put("F", 0.0);

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            subject = st.nextToken();

            s_unit = Double.parseDouble(st.nextToken());

            s_grade = st.nextToken();
            if(!s_grade.equals("P")) {
                totalUnit += s_unit;
                totalUnitMulGrade += s_unit * hashMap.get(s_grade);
            }
        }
        System.out.println(totalUnitMulGrade / totalUnit);
    }
}