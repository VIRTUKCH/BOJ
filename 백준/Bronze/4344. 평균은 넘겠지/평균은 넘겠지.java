import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int[] intarr = new int[student];

            int sum = 0;
            for (int j = 0; j < student; j++) {
                intarr[j] = Integer.parseInt(st.nextToken());
            }

            // 1. 합 구해서 평균 구하고
            for (int k = 0; k < student; k++) {
                sum += intarr[k];
            }
            double avg = (double)sum / student;

            // 2. 평균 넘는 애들 숫자 구해서 퍼센테이지 구하기
            int cnt = 0;
            for (int j = 0; j < student; j++) {
                if(avg < intarr[j]) {
                    cnt++;
                }
            }
            double percent = 100 * ((double)cnt / student);

            // 3. 출력하기
            System.out.printf("%.3f", percent);
            System.out.println("%");
        }
    }
}