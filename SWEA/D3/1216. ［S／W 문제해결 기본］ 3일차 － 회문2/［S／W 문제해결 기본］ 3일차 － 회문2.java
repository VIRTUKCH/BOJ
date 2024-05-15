import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Solution {
	public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        char[][] board = new char[100][100];
        for (int testCase = 1; testCase <= 10; testCase++) {
        	
        	// 문자열의 길이 받기 
        	testCase = Integer.parseInt(br.readLine());
        	
        	// 보드 초기화
        	for (int i = 0; i < 100; i++) {
        		board[i] = br.readLine().toCharArray();
			}
        	
        	boolean loopBreakFlag = false;
        	for (int lengthOfTargetCharacter = 100; lengthOfTargetCharacter > 0; lengthOfTargetCharacter--) {
            	// 1. 가로 탐색
            	for (int j = 0; j < board.length; j++) {
    				char[] targetCharacter = new char[lengthOfTargetCharacter];
    				for (int j2 = 0; j2 < board.length - lengthOfTargetCharacter + 1; j2++) {
    					for (int k = 0; k < targetCharacter.length; k++) {
    						targetCharacter[k] = board[j2+k][j]; 
    					}
    					
    					if(isPalindrome(targetCharacter)) {
    						loopBreakFlag = true;
    						System.out.println("#" + testCase + " " + lengthOfTargetCharacter);
    					}
    					if(loopBreakFlag == true) {
            				break;
            			}
    				}
    				if(loopBreakFlag == true) {
        				break;
        			}
    			}
            	if(loopBreakFlag == true) {
    				break;
    			}
            	
            	// 2. 세로 탐색 
            	for (int j = 0; j < board.length; j++) { // 줄의 개수 만큼 돌아 가기  
            		char[] targetCharacter = new char[lengthOfTargetCharacter];
            		for (int j2 = 0; j2 < board.length - lengthOfTargetCharacter + 1; j2++) { // 문자열이 끝까지 갈 수 있는 만큼 
            			for(int k = 0; k < targetCharacter.length; k ++) { // 문자열의 길이만큼 돌리기 
            				targetCharacter[k] = board[j][j2 + k];
            			}
            			if(isPalindrome(targetCharacter)) {
            				loopBreakFlag = true;
            				System.out.println("#" + testCase + " " + lengthOfTargetCharacter);
            			}
            			
            			if(loopBreakFlag == true) {
            				break;
            			}
    				}
            		if(loopBreakFlag == true) {
        				break;
        			}
    			}
			}
        	
        }
    }
	
    public static boolean isPalindrome(char[] charArr) {
    	for (int i = 0; i < charArr.length / 2; i++) {
			if(charArr[i] == charArr[charArr.length - i - 1]) {
				continue;
			} else {
				return false;
			}
		}
    	return true;
    }
}