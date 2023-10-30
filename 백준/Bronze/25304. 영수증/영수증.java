import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int repeat = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += a*b;
        }
       if (sum == total) {
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }
    }
}