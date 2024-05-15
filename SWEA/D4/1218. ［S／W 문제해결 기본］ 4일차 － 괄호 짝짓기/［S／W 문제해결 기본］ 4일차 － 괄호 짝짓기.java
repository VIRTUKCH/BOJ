import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;
 
class Solution {
	public static void main(String args[]) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        for (int testCase = 1; testCase <= 10; testCase++) {
        	Stack<Character> stack = new Stack<Character>();
        	int n = Integer.parseInt(br.readLine());
        	
        	String characterInput = br.readLine();
        	
        	boolean exitFlag = false;
        	
        	for (int i = 0; i < n; i++) {
				char inputCharacter = characterInput.charAt(i);
				//  '()', '[]', '{}', '<>' 
				if(inputCharacter == '(' || inputCharacter == '[' || inputCharacter == '{' || inputCharacter == '<') {
					stack.add(inputCharacter);
//					System.out.println("여는 괄호 : " + inputCharacter);
				} else {
					char poppedCharacter = stack.pop();
//					System.out.println("닫힌 괄호 : " + inputCharacter);
					if(inputCharacter == ')' && poppedCharacter == '(') {
						continue;
					} else if(inputCharacter == ']' && poppedCharacter == '[') {
						continue;
					} else if(inputCharacter == '}' && poppedCharacter == '{') {
						continue;
					} else if(inputCharacter == '>' && poppedCharacter == '<') {
						continue;
					} else {
						System.out.println("#" + testCase + " " + 0);
						exitFlag = true;
						break;
					}
				}
			}
        	if(!exitFlag) 
        	System.out.println("#" + testCase + " " + 1);
        }
    }
}