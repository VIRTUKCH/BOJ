import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstFn = Integer.parseInt(st.nextToken());
        int secondFn = Integer.parseInt(st.nextToken());
        int gn = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if(firstFn * n + secondFn <= gn * n && firstFn <= gn) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}