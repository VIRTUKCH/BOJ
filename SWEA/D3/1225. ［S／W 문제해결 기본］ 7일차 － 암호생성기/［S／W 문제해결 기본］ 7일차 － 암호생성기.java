import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
 
class Solution {
	public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int testCase = 1; testCase <= 10; testCase++) {
        	List<Integer> list = new LinkedList<>();
        	testCase = Integer.parseInt(br.readLine());
        	
        	st = new StringTokenizer(br.readLine());
        	while(st.hasMoreTokens()) {
        		list.add(Integer.parseInt(st.nextToken()));
        	}
        	
        	// 여기까지 이상 없음 
        	
        	while(!hasZero(list)) {
        		cycle(list);
        	}
        	
        	System.out.print("#" + testCase + " ");
        	for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
        	System.out.println();
        }
    }

	
	private static boolean hasZero(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			if(temp == 0) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

	private static void cycle(List<Integer> list) {
		for (int i = 1; i <= 5; i++) {
			int temp = list.remove(0);
			
			if((temp - i) <= 0) {
				temp = 0;
				list.add(temp);
				break;
			}
			
			temp = temp - i;
			list.add(temp);
		}
		return;
	}
}