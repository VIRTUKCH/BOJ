import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int money = Integer.parseInt(br.readLine());
            System.out.print(money / 25 + " ");
            money = money % 25;
            System.out.print(money / 10 + " ");
            money = money % 10;
            System.out.print(money / 5 + " ");
            money = money % 5;
            System.out.println(money);
        }
    }
}