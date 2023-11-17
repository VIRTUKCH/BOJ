import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        int result = (int) (c-a);
        result = (int)(Math.ceil(result / (a-b)) + 1);
        System.out.println(result);
    }
}