import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int i_have = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선의 개수
		int i_need = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수
		
		long max=0, mid=0, min=0;
		int lan[] = new int[i_have];
		
		for(int i=0; i<i_have; i++) {
			lan[i] = Integer.parseInt(br.readLine());
			max = Math.max(lan[i], max); // 최대값까지 갱신해준다
		}
		
		// -------------------------------------------- 입력 끝 --------------------------------------------
		
        max++;
		long cutted_line = 0; // 자른 후의 랜선의 개수가 몇개니?
		while(min < max) {
			cutted_line=0; // 자른 후의 랜선의 개수가 몇개니?
			mid = (max + min) / 2;
			for(int j=0; j<i_have; j++) {
				cutted_line += lan[j] / mid;
			}
			
			if(cutted_line < i_need) { max = mid; } // 자른 후의 랜선의 개수 < 필요한 랜선의 개수 -> 맥시멈을 떨궈야
			else { min = mid+1; }
		}
		System.out.println(min-1);
	}
}









