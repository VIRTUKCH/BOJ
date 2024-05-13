import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		// System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextLine(); // 1
			int[] countArr = new int[101];
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			while(st.hasMoreTokens()) {
				int score = Integer.parseInt(st.nextToken());
				countArr[score]++;
			}
			
//			System.out.println(Arrays.toString(countArr));
			
			int maxCount = 0;
			int maxValue = 0;
			
			for (int i = 0; i < countArr.length; i++) {
				if(countArr[i] >= maxCount) {
					maxCount = countArr[i];
					maxValue = i;
				}
			}
			System.out.println("#" + test_case + " " + maxValue);
		}
	}
}