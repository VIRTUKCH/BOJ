import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==1)
            return;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        
        while(true) {
            for (int i = 2; i < (int) (Math.sqrt(n) + 1); i++) {
                if(n % i == 0) {
                    System.out.println(i);
                    n = n/i;
                    break;
                }
            }

            if(isPrime(n) || n==1) {
                System.out.println(n);
                return;
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}