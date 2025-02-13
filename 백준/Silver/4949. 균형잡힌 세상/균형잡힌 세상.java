import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

import javax.imageio.metadata.IIOMetadataFormatImpl;

// Run Shortcut => Shift + Command + Function + F11
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			boolean flag = true;
			int index = 0;
			String str = br.readLine();
			
			if (str.length() == 0 || str.charAt(0) == '.') {
				break;
			}
			char[] charArr = new char[str.length()+1];
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				// 1. 여는 거라면 일단 적어 두자. 
				if (c == '(' || c == '[') {
					charArr[index] = c;
					index++; // 2. 그리고 인덱스를 하나 뒤로 밀자.
				}
				
				// 3. 닫는 거라면 이전에 있던 거하고 아다리가 맞는지 보자.
				if (c == ')' || c == ']') {
					index--;
					
					// 3-1. 근데 이전에 있던 게 없어도 문제고(닫는 거 개수가 더 많은 경)
					if (index < 0) {
						System.out.println("no");
						flag = false;
						break;
					}
					
					// 3-2. 이전에 있던 거랑 짝이 안 맞아도 문제	
					if (charArr[index] == '(' && c != ')' || charArr[index] == '[' && c != ']') {
						System.out.println("no");
						flag = false;
						break;
					}
				}
			}
			// 4. 여는 게 더 많으면 NO + flag 는 true 로 무사 통과해야 
			if (index > 0 && flag) {
				System.out.println("no");
				continue;
			}
			
			// 5. 위에서 NO 라고 한 게 아니라면 YES
			if (flag) {
				System.out.println("yes");
				continue;
			}
			

		}
	}
}