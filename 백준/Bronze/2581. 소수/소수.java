import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = 0;
        int min=Integer.MAX_VALUE;

        for (int i = a; i <= b; i++) {
            if(isPrime(i)) {
                sum += i;
                if(min > i) {
                    min = i;
                }
            }
        }

        if(min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static boolean isPrime(int i) {
        if(i == 1) {
            return false;
        } else if (i == 2) {
            return true;
        }

        for (int j = 2; j < i; j++) {
            if(i % j == 0) {
                return false;
            }
        }
        return true;
    }
}