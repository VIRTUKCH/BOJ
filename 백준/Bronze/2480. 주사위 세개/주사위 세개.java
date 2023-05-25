import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, "+ ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());

        int result = 0;

        if(first == second && second == third) {
            result = 10000 + first * 1000;
        } else if (first == second) {
            result = 1000 + 100 * first;
        } else if (first == third) {
            result = 1000 + 100 * first;
        } else if (second == third) {
            result = 1000 + 100 * second;
        } else {
            result = whatIsBig(first, second, third) * 100;
        }
        System.out.println(result);
    }

    private static int whatIsBig(int first, int second, int third) {
        if(first > second && first > third) {
            return first;
        } else if(second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }
}