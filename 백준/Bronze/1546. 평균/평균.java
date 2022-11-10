import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		double highScore = 0;

		String[] strArr = br.readLine().split(" ");

		for (int index = 0; index < strArr.length; index++) { // 최대값 구하기
			highScore = Integer.parseInt(strArr[index]) > highScore ? Integer.parseInt(strArr[index]) : highScore;
		}

		double sum = 0;
		for (int index = 0; index < strArr.length; index++) {
			sum += (Integer.parseInt(strArr[index]) / highScore) * 100;
		}

		System.out.println(sum / strArr.length);
	}
}