import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " +");
        int N = Integer.parseInt(st.nextToken());

        int intarr[] = new int[N];
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " +");
        for (int i = 0; i < N; i++) {
            intarr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (intarr[i] < X) {
                System.out.print(intarr[i] + " ");
            }
        }
    }
}