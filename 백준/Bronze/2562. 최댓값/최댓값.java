import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArr = new int[9];
		int max = 0;
		int cnt = 0;
		for (int index = 0; index < 9; index++) {
			intArr[index] = Integer.parseInt(br.readLine());
			if (intArr[index] > max) {
				max = intArr[index];
				cnt = index;
			}
		}
		System.out.println(max);
		System.out.println(cnt + 1);
	}
}
