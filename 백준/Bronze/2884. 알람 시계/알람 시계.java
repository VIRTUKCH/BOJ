import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, "+ ");

        int hour = Integer.parseInt(st.nextToken());
        int minuite = Integer.parseInt(st.nextToken());

        if(minuite < 45) {
            hour = (hour + 23) % 24;
            minuite += 15;
        } else {
            minuite -= 45;
        }
        System.out.println(hour + " " + minuite);
    }
}