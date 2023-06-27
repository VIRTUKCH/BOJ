import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static StringBuilder calculateResult(int number, int expo, StringBuilder sb) {
		int temp=1;
		for (int i = 0; i < expo; i++) {
			temp = (temp * number) % 10;
		}
		if(temp == 0 )
			return sb.append("10\n");
		return sb.append(temp + "\n");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		// ------ 여기까지 문제 없는 듯 ------

		for (int i = 0; i < repeat; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = Integer.parseInt(st.nextToken());
		int expo = Integer.parseInt(st.nextToken());
		sb = calculateResult(number, expo, sb);
		}
		System.out.print(sb);
	}
}