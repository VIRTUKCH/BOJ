import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.imageio.metadata.IIOMetadataFormatImpl;

// Run Shortcut => Shift + Command + Function + F11
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 0, M = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		long[] arrayValue = new long[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arrayValue.length; i++) {
			arrayValue[i] = Long.parseLong(st.nextToken());
		}
		
		long[] sumArrayValue = new long[N];
		for (int i = 0; i < sumArrayValue.length; i++) {
			if(i>0) {
				sumArrayValue[i] = arrayValue[i] + sumArrayValue[i-1];
			} else {
				sumArrayValue[i] = arrayValue[i];
			}
		}
		
		int a = 0, b = 0;
		// 1. 여러 번 받아
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(a == 1) {
				System.out.println(sumArrayValue[b-1]);
			} else {
				System.out.println(sumArrayValue[b-1] - sumArrayValue[a-2]);
			}
		}
	}
}