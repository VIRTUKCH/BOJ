import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'a' && str[i] <= 'z') {
				str[i] -= 32;
			} else if (str[i] >= 'A' && str[i] <= 'Z') {
				str[i] += 32;
			}
		}
		System.out.println(str);
	}
}