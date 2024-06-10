import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int resultUp = a * d + b * c;
        int resultDown = b * d;

        int g = uclidSolution(resultUp, resultDown);
        int resultA = resultUp / g;
        int resultB = resultDown / g;
        System.out.println(resultA + " " + resultB);
    }

    public static int uclidSolution(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a % b == 0) {
            return b;
        } else {
            return uclidSolution(b, a % b);
        }
    }
}
