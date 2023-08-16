import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "+ ");
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());

		long[] S = new long[suNo + 1]; // SumArray의 개수는 하나 더 만든다.

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken()); // 5, 4, 3, 2, 1
		}

		for (int i = 0; i < quizNo; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			System.out.println(S[q] - S[p-1]);
		}
	}
}