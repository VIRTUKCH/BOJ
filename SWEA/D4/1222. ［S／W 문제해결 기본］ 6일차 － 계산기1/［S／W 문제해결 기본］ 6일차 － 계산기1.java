import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Solution {
	public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int testCase = 1; testCase <= 10; testCase++) {
        	br.readLine();
        	st = new StringTokenizer(br.readLine(), "+");
        	int result = 0;
        	while(st.hasMoreTokens()) {
        		result += Integer.parseInt(st.nextToken());
        	}
        	sb.append("#" + testCase + " " + result + "\n");
        }
        System.out.println(sb);
    }
}