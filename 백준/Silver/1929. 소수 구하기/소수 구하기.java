import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                for (int i = a; i <= b; i ++) {
                        if(isPrime(i)) {
                                System.out.println(i);
                        } else {
                                continue;
                        }
                }

        }

        public static boolean isPrime(int n) {
                if (n < 2) return false;
                if (n == 2) return true;
                if (n % 2 == 0) return false;

                for (int i = 3; i < Math.sqrt(n) + 1; i += 2) {
                        if (n % i == 0) {
                                return false;
                        }
                }
                return true;
        }
}