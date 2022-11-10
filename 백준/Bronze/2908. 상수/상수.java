import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[2];
		for(int i=0; i<2; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			num[i] = (num[i]%10) * 100 + ((num[i]/10)%10)*10 + (num[i]/100);
		}
		System.out.println(num[0] > num[1] ? num[0] : num[1]);
	}
}