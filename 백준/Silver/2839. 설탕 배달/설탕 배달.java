import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0;
		
		if(n > 12) {
			cnt = n/5 - 2; // -2?
			n = (n % 5) + 10; // +10?
		}
		
		if(n % 3 == 0) {
			cnt += n / 3;
			n = n%3;
			System.out.println(cnt);
		}
		else if(n==1 || n==2 || n==4 || n==7)
		{
			System.out.println(-1);
			return;
		}
		else if(n==5) { System.out.println(cnt+1);}
		else if(n==8) { System.out.println(cnt+2); }
		else if(n==10) { System.out.println(cnt+2); }
		else if(n==11) { System.out.println(cnt+3); }
		else if(n==13) { System.out.println(cnt+3); }
		else if(n==14) { System.out.println(cnt+4); }
		
	}

}
