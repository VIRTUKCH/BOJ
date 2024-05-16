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
        StringTokenizer st;
        
        List<Integer> list = new LinkedList<Integer>();
        for (int testCase = 1; testCase <= 10; testCase++) {
        	list.clear();
        	int lenOfPassWord = Integer.parseInt(br.readLine());
        	st = new StringTokenizer(br.readLine());
        	
        	while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
        	
        	int howMuchOrder = Integer.parseInt(br.readLine());
        	
        	st = new StringTokenizer(br.readLine());
        	while(st.hasMoreTokens()) {
        		String orderSort = st.nextToken();
        		
        		if(orderSort.equals("I")) {
            		int x = Integer.parseInt(st.nextToken()); // 인덱스 
            		int y = Integer.parseInt(st.nextToken()); // 개수 
            		for (int i = x; i < x + y; i++) {
            			int value = Integer.parseInt(st.nextToken());
    					list.add(i, value);
    				}
        		}
        		
        		if(orderSort.equals("D")) {
        			int x = Integer.parseInt(st.nextToken());
        			int y = Integer.parseInt(st.nextToken());
        			for (int i = 0; i < y; i++) {
						list.remove(x);
					}
        		}
        		

        	}
        	System.out.print("#" + testCase + " ");
        	printList(list);
        }
    }

	private static void printList(List<Integer> list) {
		for (int i = 0; i < 10; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}