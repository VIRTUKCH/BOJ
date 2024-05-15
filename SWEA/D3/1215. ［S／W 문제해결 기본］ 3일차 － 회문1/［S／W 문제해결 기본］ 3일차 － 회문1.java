import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
class Solution {
	public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        char[][] board = new char[8][8];
        int cnt = 0;
        for (int i = 1; i <= 10; i++) {
        	cnt = 0;
        	
        	// 문자열의 길이
        	int lengthOfString = Integer.parseInt(br.readLine());
        	
        	// 보드 초기화
        	for (int j = 0; j < 8; j++) {
				board[j] = br.readLine().toCharArray();
			}
        	
        	// 1. 가로 탐색
        	for (int j = 0; j < board.length; j++) {
				char[] targetCharacter = new char[lengthOfString];
				for (int j2 = 0; j2 < board.length - lengthOfString + 1; j2++) {
					for (int k = 0; k < targetCharacter.length; k++) {
						targetCharacter[k] = board[j2+k][j]; 
					}
//					System.out.println(Arrays.toString(targetCharacter));
					if(isPalindrome(targetCharacter)) {
						cnt++;
//						System.out.println("cnt 증가 1");
					}
				}

			}
//        	System.out.println("-------------");
        	// 2. 세로 탐색 
        	for (int j = 0; j < board.length; j++) { // 8줄 돌릴 건
        		char[] targetCharacter = new char[lengthOfString];
        		for (int j2 = 0; j2 < board.length - lengthOfString + 1; j2++) { // 5번 돌릴 거에요
        			for(int k = 0; k < lengthOfString; k ++) {
        				targetCharacter[k] = board[j][j2 + k];
        			}
        			if(isPalindrome(targetCharacter)) {
        				cnt++;
//        				System.out.println("cnt 증가 2");
        			}
//        			System.out.println(Arrays.toString(targetCharacter));
				}
			}
        	
        	// 3. 결과 출력 
        	System.out.println("#" + i + " " + cnt);
        }
    }
    
    public static boolean isPalindrome(char[] charArr) {
    	for (int i = 0; i < charArr.length/2; i++) {
			if(charArr[i] == charArr[charArr.length - i - 1]) {
				continue;
			} else {
				return false;
			}
		}
    	return true;
    }
}