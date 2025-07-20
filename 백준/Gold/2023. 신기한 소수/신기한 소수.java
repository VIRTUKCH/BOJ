import java.util.*;
import java.io.*;

public class Main {

	static int N;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		// 가지치기를 하면서 갈 거다. 가지치기의 시작점에는 2, 3, 5, 7 외에는 올 수 없다.
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}

	static void DFS(int number, int jarisu) {
		// 1. 반복문 내 종료 조건 세팅
		if (jarisu == N) {
			// 1-1. [종료 조건] 자리 수가 맞으면서 & 소수라면 -> 출력해라
			if (isPrime(number)) {
				System.out.println(number);
			}
			// 1-2. [종료 조건] 자리 수가 맞으면서 & 소수가 아니라면 -> 탐색 중지
			return;
		}

		// 2. 다음 자리를 탐색해야 함
		for (int i = 1; i < 10; i++) {
			// 2-1. 다음 자리가 짝수라면, 소수 아닌 거 확정이니까 패스
			if (i % 2 == 0) {
				continue;
			}

			// 2-2. 다음 숫자가 소수라면 -> DFS 한 번 더 진행
			if (isPrime(number * 10 + i)) {
				DFS(number * 10 + i, jarisu + 1);
			}
		}
	}

	static boolean isPrime(int n) {

		if (n < 2) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;

		for (int i = 3; i < (int)Math.sqrt(n) + 1; i = i + 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}