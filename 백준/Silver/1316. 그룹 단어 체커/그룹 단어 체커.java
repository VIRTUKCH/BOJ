import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = n;
		int cnt2 = 0;
		
		for(int i=0; i<n; i++) {
			char[] str = br.readLine().toCharArray();
	   		cnt2=0;
			for(int j=0; j<str.length-1; j++) {
			   	if(str[j] != str[j+1]) { // 만약에 ab라는 패턴이 나타났다면 -> 그 이후에는 a가 나왔을 때 비정상
			  		for(int k=j+2; k<str.length; k++) {
			  			if(str[j] == str[k] && cnt2==0) {
			  				cnt--;
			  				cnt2++;
			  			}
			  		}
			   	}
			}
		}
		System.out.println(cnt);
	}
}