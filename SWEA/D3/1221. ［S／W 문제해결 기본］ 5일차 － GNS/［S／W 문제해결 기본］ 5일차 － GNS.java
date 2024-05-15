import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
 
class Solution {
	public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<Integer>();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        for (int testCase = 1; testCase <= N; testCase++) {
        	list.clear();
        	sb = new StringBuilder();
        	st = new StringTokenizer(br.readLine());
        	
        	String test = st.nextToken();
        	int lenOfTestCase = Integer.parseInt(st.nextToken());
        	
        	st = new StringTokenizer(br.readLine());
        	
        	for (int i = 0; i < lenOfTestCase; i++) {
        		switch (st.nextToken()) {
				case "ZRO":
					list.add(0);
					break;
				case "ONE":
					list.add(1);
					break;
				case "TWO":
					list.add(2);
					break;
				case "THR":
					list.add(3);
					break;
				case "FOR":
					list.add(4);
					break;
				case "FIV":
					list.add(5);
					break;
				case "SIX":
					list.add(6);
					break;
				case "SVN":
					list.add(7);
					break;
				case "EGT":
					list.add(8);
					break;
				case "NIN":
					list.add(9);
					break;
				default:
					break;
        		}
			}
        	Collections.sort(list);
        	
        	for (Integer value : list) {
        		switch (value) {
				case 0:
					sb.append("ZRO ");
					break;
				case 1:
					sb.append("ONE ");
					break;
				case 2:
					sb.append("TWO ");
					break;
				case 3:
					sb.append("THR ");
					break;
				case 4:
					sb.append("FOR ");
					break;
				case 5:
					sb.append("FIV ");
					break;
				case 6:
					sb.append("SIX ");
					break;
				case 7:
					sb.append("SVN ");
					break;
				case 8:
					sb.append("EGT ");
					break;
				case 9:
					sb.append("NIN ");
					break;
        		}
			}
//        	if (testCase != 1) {
//				System.out.println();
//			}
        	System.out.println(test);
        	System.out.println(sb.toString());
        }
    }
}