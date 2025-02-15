import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Run Shortcut => Shift + Command + Function + F11
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 입력의 개
		int M = Integer.parseInt(st.nextToken()); // 나누는 
		
		// 1. 입력을 배열로 받기 
		long[] inputArr = new long[N+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < inputArr.length; i++) {
			inputArr[i] = Long.parseLong(st.nextToken());
		}
		
		// 2. 누적합 배열 만들기
		long[] sumArr = new long[N+1];
		for (int i = 1; i < sumArr.length; i++) {
			sumArr[i] = sumArr[i-1] + inputArr[i]; 
		}
		
//		System.out.println("sumArr : " + Arrays.toString(sumArr));
		
		long result = 0;
		// 3. 약수로 나누기 
		for (int i = 1; i < sumArr.length; i++) {
			sumArr[i] = sumArr[i] % M;
			
			// 3-1. 약수로 나눠서 0인 것들은 일단 더하기 
			if(sumArr[i] == 0) {
				result++;
			}
		}
		
		// 0 ~ M 에 대해서, 나머지가 같은 것들에 대해서 두 개 씩 뽑아서 개수 더하
		long cnt = 0;
		for (int i = 0; i < M; i++) { // 이거는 나누고 난 나머지 
			cnt = 0;
			for (int j = 1; j < sumArr.length; j++) { // 이거는 배열의 길이에 따라 전수조사 
				if (sumArr[j] == i) {
					cnt++;
				}	
			}
			result += cnt * (cnt-1) / 2;
		}
		
		System.out.println(result);
	}
}