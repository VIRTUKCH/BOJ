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
        StringTokenizer st;
        
        for (int i = 1; i <= 10; i++) {	// 테스트의 개수가 열 개
        	List<Integer> list = new ArrayList<>();
        	int howMuchDump = Integer.parseInt(br.readLine());
        	st = new StringTokenizer(br.readLine());
        	
        	while(st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
        	}
        	
        	for (int j = 0; j < howMuchDump; j++) {
        		Collections.sort(list);
        		list.set(0, list.get(0) + 1);
				list.set(99, list.get(99) - 1);
			}
        	Collections.sort(list);
//        	System.out.println(list);
        	System.out.println("#" + i + " " + (list.get(list.size()-1) - list.get(0)));
        }
    }
}