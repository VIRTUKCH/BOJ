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
		N = Integer.parseInt(st.nextToken()); // 표의 정사각형 한 크기
		M = Integer.parseInt(st.nextToken()); // 입력의 개수

		
		// 1. 계산하기 편하게 한 변의 크기가 N+1 인 정사각형을 하나 만들자.
		int[][] squareArray = new int[N+1][];
		for (int i = 0; i < squareArray.length; i++) {
			squareArray[i] = new int[N+1];
		}
		
		// 2. 초기화하자.
		for (int i = 1; i < squareArray.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < squareArray.length; j++) {
				squareArray[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
////		 3. 테스트 출력
//		for (int i = 0; i < squareArray.length; i++) {
//			System.out.println(Arrays.toString(squareArray[i]));
//		}
		
		// 4. 누적합을 가지고 있는 배열을 생성
		int[][] S = new int[N+1][];
		for (int i = 0; i < S.length; i++) {
			S[i] = new int[N+1];
		}
		
		for (int i = 1; i < S.length; i++) {
			for (int j = 1; j < S.length; j++) { // 현재 칸은 S[i][j]
				S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + squareArray[i][j];
			}
		}
		
//		// 6. 테스트 출력
//		for (int i = 0; i < squareArray.length; i++) {
//			System.out.println(Arrays.toString(S[i]));
//		}
		
		// 7. 이제 빼면 됨
		int x1 = 0, y1 = 0;
		int x2 = 0, y2 = 0;
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
//			System.out.println("S[x2][y2] : " + S[x2][y2]);
//			System.out.println("S[x1-1][y2] : " + S[x1-1][y2]);
//			System.out.println("S[x2][y1-1] : " + S[x2][y1-1]);
//			System.out.println("S[x1-1][y1-1] : " + S[x1-1][y1-1]);
//			System.out.println("result : " + (S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1]));
//			System.out.println("==================\n");
			System.out.println((S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1]));
		}
	}
}