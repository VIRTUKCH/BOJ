import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfBagooni = Integer.parseInt(st.nextToken());
        int repeat = Integer.parseInt(st.nextToken());

        int[] intArr = new int[numOfBagooni];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i+1;
        }

        // 여기까지 이상 없음

        for (int i = 0; i < repeat; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()); // 1
            int last = Integer.parseInt(st.nextToken()); // 4

            start--; // 0
            last--; // 3

            int cnt=0;

            for (int j = start; j <= (last + start) / 2; j++) { // 0 3 -> 0 1
                int temp = intArr[j]; // j가 1이면
                intArr[j] = intArr[last-cnt]; // 1과 2를 바꿈
                intArr[last-cnt] = temp; // 1과 2를 바꿈
                cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numOfBagooni; i++) {
            sb.append(Integer.toString(intArr[i]) + " ");
        }
        System.out.println(sb);
    }
}