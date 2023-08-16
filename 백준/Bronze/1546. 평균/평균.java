import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), "+ ");

		double sum = 0, max = 0;
		for (int i = 0; i < n; i++) {
			double num = Double.parseDouble(st.nextToken());
			sum += num;
			if (num > max) {
				max = num;
			}
		}
		System.out.println((sum * 100 / max / n));
	}
}