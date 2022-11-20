import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		double result = 0;

		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'S') {
				result += 1;
			} else if (str.charAt(i) == 'L') {
				result += 0.5;
			}
		}

		result = result == n ? result : result + 1; // 솔로만 있으면 사용 가능한 사람은 솔로만큼만
		System.out.println((int) result);
	}
}