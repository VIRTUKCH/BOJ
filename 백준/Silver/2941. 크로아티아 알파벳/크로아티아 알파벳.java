import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int cnt = str.length; // 입력받은 문자열의 길이에서 크로아티아 알파벳이 등장할 때마다 줄인다.
		int i=0;
		String[] cro_alp = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(i=0; i<str.length-1; i++) {
			if(str[i] == 'c' && str[i+1] == '=') cnt--;
			else if(str[i] == 'c' && str[i+1] == '-') cnt--;
			else if(str[i] == 'd' && str[i+1] == '-') cnt--;
			else if(str[i] == 'l' && str[i+1] == 'j') cnt--;
			else if(str[i] == 'n' && str[i+1] == 'j') cnt--;
			else if(str[i] == 's' && str[i+1] == '=') cnt--;
			else if(str[i] == 'z' && str[i+1] == '=') cnt--;
		}
		for(i=0; i<str.length-2; i++) {
			if(str[i] == 'd' && str[i+1] == 'z' && str[i+2] == '=') cnt--;
		}
		System.out.println(cnt);
	}
}