import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int first = 0;
        int second = 1;

        for (int i = 2; i <= input; i++) {
            if(i%2 == 0) {
                first = first + second;
            } else {
                second = first + second;
            }
        }

        System.out.println(Math.max(first,second));
    }
}