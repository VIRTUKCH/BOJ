import java.util.*;
import java.io.*;

public class Main {

        public static int N;

        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                N = Integer.parseInt(br.readLine());

                DFS(2, 1);
                DFS(3, 1);
                DFS(5, 1);
                DFS(7, 1);
        }

        public static void DFS(int n, int digit) {
                // 종료 조건 먼저 세워야 함
                if (N == digit) {
                        // 1. 자리수가 맞으면서 + 소수이면 -> 출력하면서 종료
                        if (isPrime(n)) {
                                System.out.println(n);
                                return;
                        // 2. 자리수가 맞으면서 + 소수가 아니면 -> 그냥
                        } else {
                                return;
                        }
                }

                // 이제 자리수가 맞지 않는 케이스밖에 없음
                int[] next = new int[] {1, 3, 5, 7, 9};

                for (int i : next) {
                        if (!isPrime(n * 10 + i)) {
                                continue;
                        } else {
                                DFS(n * 10 + i, digit + 1);
                        }
                }
        }

        public static boolean isPrime(int n) {
                if (n < 2 ) return false;
                if (n == 2) return true;
                if (n % 2 == 0) return false;

                for (int i = 3; i < (int) (Math.sqrt(n)) + 1; i += 2) {
                        if (n % i == 0) {
                                return false;
                        }
                }

                return true;
        }
}