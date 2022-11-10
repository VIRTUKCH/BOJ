import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st1.nextToken()); // 입력받을 라인의 수
		int m = Integer.parseInt(st1.nextToken()); // 집으로 가져가야 할 나무의 길이
		
		int tree[] = new int[n]; // 나무의 개수
		int max=0; int min=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, tree[i]);
		}
		int ans = 0;
		//---------------------여기까지는 타협이 안됨---------------------
		while(min < max) { // 하한선 < 제일 큰 나무
			int mid = (min + max) / 2; // min과 max의 중앙값으로 mid를 정한다.
			long sum = 0; // sum은 항상 0으로 다시 초기화
			
			for(int treeHeight : tree) {
				if(treeHeight > mid) { // 나무가 자르는 길이보다 더 크면
					sum += (treeHeight - mid); // 얻는 나무의 길이를 sum에 더하기
				}
			}
			
			if(sum < m) { max = mid; } // 내가 너무 많이 잘랐다 -> 상한선 조정
			else { min = mid + 1; } // 내가 너무 조금 잘랐다 -> 하한선 조정
		}
		System.out.println(min-1);
	}
}