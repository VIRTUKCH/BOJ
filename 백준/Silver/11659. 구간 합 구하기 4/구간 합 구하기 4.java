import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "+ ");

		int numberOfData = Integer.parseInt(st.nextToken());
		int numberOfQuiz = Integer.parseInt(st.nextToken());

		int[] S = new int[numberOfData + 1];

		st = new StringTokenizer(br.readLine(), "+ ");
		for (int i = 1; i <= numberOfData; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < numberOfQuiz; i++) {
			st = new StringTokenizer(br.readLine(), "+ ");
			int start = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			System.out.println(S[last] - S[start - 1]);
		}
	}
}