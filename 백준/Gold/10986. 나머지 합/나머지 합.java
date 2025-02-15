import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Run Shortcut => Shift + Command + Function + F11
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = 0, M = 0;
		N = Integer.parseInt(st.nextToken()); // 크기
		M = Integer.parseInt(st.nextToken()); // 나누는 수 
		
		// 1. 입력 받을 배열을 준비
		long[] intArr = new long[N];

		// 2. 입력 받기
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Long.parseLong(st.nextToken()); 
		}
		
		// 3. 구간합 구해두기 
		long[] S = new long[N+1];
		for (int i = 1; i < S.length; i++) {
			S[i] = S[i-1] + intArr[i-1];
		}

		long result = 0;
		long pure = 0;
		
		// 5. 순회하면서 M 으로 나눠 보고, M 으로 나눠 떨어지면 (N) * (N-1) / 2 만큼 결과에 더하기
		for (int i = 1; i < S.length; i++) {
			S[i] = S[i] % M;
			if(S[i] == 0) {
				pure++;
			}
		}
		// 1) M 으로 나눠지는 거 개수만큼 더
		result += pure;
		
		// 2) M 끼리 연산 가능하니까 더해
		result += pure * (pure - 1) / 2;
				
		// 6. 배열을 순회하면 0 ~ M 사이의 수일 거임
		for (int i = 1; i < M; i++) { // 비교할 숫자를 먼저 정하고
			long cnt = 0;
			for (int j = 1; j < S.length; j++) { // 배열의 사이즈만큼 돌아 보자.
				if (S[j] == i) {
					cnt++;
				}
			}
			// 3) 그러면 같은 것끼리 조합으로 두 개 뽑아
			result += cnt * (cnt - 1) / 2;
		}
		
		System.out.println(result);
	}
}