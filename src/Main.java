import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			changeROT13(str.charAt(i));
		}
	}

	private static void changeROT13(char c) {
		if (c >= 'a' && c <= 'z') {
			c = changeROT13LowerCase(c);
		} else if (c >= 'A' && c <= 'Z') {
			c = changeROT13UpperCase(c);
		}
		System.out.print(c);
	}

	private static char changeROT13UpperCase(char c) { // 소문자인 경우
		c += 13;
		return (c > 'Z') ? (char) (c - 26) : c;
	}

	private static char changeROT13LowerCase(char c) { // 대문자인 경우
		c += 13;
		return (c > 'z') ? (char) (c - 26) : c;
	}
}