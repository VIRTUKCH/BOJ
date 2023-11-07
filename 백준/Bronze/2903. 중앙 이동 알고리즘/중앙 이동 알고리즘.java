import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int a = 2;
        for (int i = 1; i <= N; i++) {
            a = a * 2 - 1;
        }
        System.out.println((int) Math.pow(a, 2));
    }
}