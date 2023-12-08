import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Long result = 0L;
        for (int i = 0; i < n; i++) {
            result += (long) ((long) (str.charAt(i) - 96) * Math.pow(31, i));
        }
        System.out.println(result);
    }
}