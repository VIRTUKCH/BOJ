import java.io.BufferedReader;
import java.io.InputStreamReader;
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

            int temp = intArr[start]; // j가 1이면
            intArr[start] = intArr[last]; // 1과 2를 바꿈
            intArr[last] = temp; // 1과 2를 바꿈
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numOfBagooni; i++) {
            sb.append(Integer.toString(intArr[i]) + " ");
        }
        System.out.println(sb);
    }
}