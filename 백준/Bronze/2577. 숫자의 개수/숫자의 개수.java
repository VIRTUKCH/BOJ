import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()); // 값을 입력받아 정수로 바꾸고 a에 저장.
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		int result = a * b * c; // a,b,c를 곱해서 result에 저장한다.
		char[] resultCharArray = Integer.toString(result).toCharArray(); // result를 charArray로 바꾼다 -> 한 자리씩 접근 가능

//		System.out.println(Arrays.toString(resultCharArray)); // 값은 잘 들어감. 확인완료

		int cntArr[] = new int[10];
		for (int index = 0; index < resultCharArray.length; index++) {
//			System.out.println(cntArr[resultCharArray[index]]); // 여기서 Exception 발생
			cntArr[resultCharArray[index] - 48]++;
		}

		for (int index = 0; index < cntArr.length; index++) {
			System.out.println(cntArr[index]);
		}

//		for (int index = 0; index < resultCharArray.length; index++) { // 내가 왜 이렇게 했지?
//			System.out.println(cntArr[resultCharArray[index] - 48]);
//		}
	}
}