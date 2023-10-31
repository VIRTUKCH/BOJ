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

        for (int i = 0; i < repeat; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            int numOfBall = Integer.parseInt(st.nextToken());

            start--;
            last--;

            for (int j = start; j <= last; j++) {
                intArr[j] = numOfBall;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numOfBagooni; i++) {
            sb.append(Integer.toString(intArr[i]) + " ");
        }
        System.out.println(sb);
    }
}