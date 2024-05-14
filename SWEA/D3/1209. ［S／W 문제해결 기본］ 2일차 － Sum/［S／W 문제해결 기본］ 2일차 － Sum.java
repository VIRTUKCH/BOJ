import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Solution {
    public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[][] intArr = new int[100][100];
        for (int i = 0; i < 10; i++) {
        	int testNumber = Integer.parseInt(br.readLine());
        	
        	// 1. 배열 초기화
        	for (int arrayIndex_X = 0; arrayIndex_X < 100; arrayIndex_X++) {
        		st = new StringTokenizer(br.readLine());
				for (int arrayIndex_Y = 0; arrayIndex_Y < 100; arrayIndex_Y++) {
					intArr[arrayIndex_X][arrayIndex_Y] = Integer.parseInt(st.nextToken());
				}
			}
        	
        	// 2. 최댓값 도출
        	int[] garoMax = new int[100];  
        	int[] seroMax = new int[100];
        	
        	int leftDaegakMax = 0;
        	int rightDaegakMax = 0;
        	
        	for (int j = 0; j < 100; j++) {
				for (int j2 = 0; j2 < 100; j2++) {
					garoMax[j] += intArr[j][j2];
					seroMax[j] += intArr[j2][j];
					if(j == j2) {
						leftDaegakMax += intArr[j][j2];
					} 
					
					if(j + j2 == 99) {
						rightDaegakMax += intArr[j][j2];
					}
				}
			}
        	
        	// 3. 그 중에 최댓값 도출
        	int max = 0;
        	for (int j = 0; j < 100; j++) {
				if(garoMax[j] > max) {
					max = garoMax[j];
				}
				
				if(seroMax[j] > max) {
					max = seroMax[j];
				}
			}
        	
        	if(leftDaegakMax > max) {
        		max = leftDaegakMax;
        	}
        	
        	if(rightDaegakMax > max) {
        		max = rightDaegakMax;
        	}
        	
        	System.out.println("#" + (i+1) + " " + max);
		}
    }
}