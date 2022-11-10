import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] original = {1,1,2,2,2,8};
		
		for(int i=0; i<original.length; i++) {
			System.out.print(original[i] - Integer.parseInt(input[i]) + " ");
		}
	}
}