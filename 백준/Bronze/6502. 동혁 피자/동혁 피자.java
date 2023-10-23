import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " +");

            double r = Integer.parseInt(st.nextToken());
            if(r == 0) {break;}
            double w = Integer.parseInt(st.nextToken());
            double l = Integer.parseInt(st.nextToken());

            // 2 * r < 루트(w^2 + l^2)

            System.out.print("Pizza " + (++i) + " ");
            if(2 * r < Math.sqrt(Math.pow(w, 2) + Math.pow(l, 2))) {
                System.out.println("does not fit on the table.");
            } else {
                System.out.println("fits on the table.");
            }
        }
    }
}