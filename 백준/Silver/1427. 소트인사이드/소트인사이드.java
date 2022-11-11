import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] charArray = br.readLine().toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length - 1; j++) {
				if (charArray[j] < charArray[j + 1]) {
					char temp = charArray[j + 1];
					charArray[j + 1] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		System.out.println(charArray);
	}
}