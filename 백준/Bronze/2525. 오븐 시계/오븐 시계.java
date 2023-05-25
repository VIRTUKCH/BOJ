import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstInput = br.readLine();
        StringTokenizer st = new StringTokenizer(firstInput, "+ ");

        int hour = Integer.parseInt(st.nextToken());
        int minuite = Integer.parseInt(st.nextToken());

        String secondInput = br.readLine();
        int necessaryMinuite = Integer.parseInt(secondInput);

        int totalMinuite = hour * 60 + minuite + necessaryMinuite;
        System.out.println((totalMinuite / 60) % 24 + " " + totalMinuite % 60);
    }
}