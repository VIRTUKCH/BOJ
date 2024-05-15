import java.util.Scanner;
 
class Solution {
	public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
        
        for (int testCase = 1; testCase <= 10; testCase++) {
        	testCase = Integer.parseInt(sc.nextLine());
        	
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	sc.nextLine();
        	
        	int result = 1;
        	result = callRecursive(result, N, M);
        	System.out.println("#" + testCase + " " + result);
        }
        sc.close();
    }

	private static int callRecursive(int result, int n, int m) {
		if(m == 0) {
			return result;
		} else {
			return callRecursive(result * n, n, m-1);
		}
	}
}