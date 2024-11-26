import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			long inputLongValue = Long.parseLong(br.readLine());
			
			// 소수가 아니다 -> 1 더해서 일단 해보셈
			while(true) {
				// 소수다 -> 바로 프린트
				if(isPrime(inputLongValue)) {
					System.out.println(inputLongValue);
					break;
				} else {
					inputLongValue++;
				}
			}
		}
	}
	
	// long 을 입력 받아서, 소수인지 아닌지를 판단하는 메서드
	static boolean isPrime(long value) {
		
		if (value == 1L || value == 0L) {
			return false;
		} else if (value == 2L) {
			return true;
		}
		
		long sqrtValue = (long) Math.sqrt(value);
		
		for (int i = 2; i <= sqrtValue + 1; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}




