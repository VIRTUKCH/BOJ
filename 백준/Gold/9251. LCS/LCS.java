import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char[] str = br.readLine().toCharArray();
//		char[] str2 = br.readLine().toCharArray();
		
		String a = br.readLine();
		String b = br.readLine();
		
		char[] str = new char[a.length() + 1];
		char[] str2 = new char[b.length() + 1];
		
		str = (" " + a).toCharArray();
		str2 = (" " + b).toCharArray();
		
		int cnt[][] = new int[str.length+1][str2.length+1];
		int count = 0;
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str2.length; j++) {
				if(i==0 || j==0) { cnt[i][j] = 0; } // 바깥쪽은 0으로 도배를 하고
				else if(str[i] == str2[j]) { cnt[i][j] = cnt[i-1][j-1] + 1; } // 같으면 왼쪽 위에다 1을 더하고
				else { cnt[i][j] = Math.max(cnt[i-1][j], cnt[i][j-1]); } // 다르면 왼쪽 or 위쪽 중 큰 값을 가져다 씀.
//				System.out.print("[" + cnt[i][j] + "]");
			} // 안쪽 for문
//			System.out.println();
		} // 바깥쪽 for문
		System.out.println(cnt[str.length-1][str2.length-1]);
	}
}