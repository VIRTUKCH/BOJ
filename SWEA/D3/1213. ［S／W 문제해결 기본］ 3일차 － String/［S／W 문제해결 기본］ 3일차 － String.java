import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Solution {
    public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        for (int i = 1; i <= 10; i++) {
        	int test = Integer.parseInt(br.readLine());
        	String mustFindString = br.readLine();
        	String targetString = br.readLine();
//        	System.out.println("targetString : " + targetString);
//        	System.out.println("mustFindString : " + mustFindString);
        	
        	int cnt = 0;
        	for (int j = 0; j <= targetString.length() - mustFindString.length(); j++) {
				String testString = (String) targetString.subSequence(j, j + mustFindString.length());
				if(testString.equals(mustFindString)) {
					cnt++;
				}
			}
        	System.out.println("#" + i + " " + cnt);
        }
    }
}