import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum=0;
		char[] str = br.readLine().toCharArray();
		for(int i=0; i<num; i++) {
			sum += (int)(str[i]-48);
		}
		System.out.println(sum);
	}
}