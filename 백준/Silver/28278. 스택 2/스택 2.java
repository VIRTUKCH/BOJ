import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] stack = new int[1000000];
		int point = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());

			if (first == 1) {
				stack[point++] = (Integer.parseInt(st.nextToken()));
			} else if (first == 2) {
				if(point == 0){
					sb.append(-1).append('\n');
				} else {
					sb.append(stack[--point]).append('\n');
				}
			} else if (first == 3) {
				sb.append(point).append('\n');
			} else if (first == 4) {
				if(point == 0){
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
			} else if (first == 5) {
				if(point == 0){
					sb.append(-1).append('\n');
				} else {
					sb.append(stack[point - 1]).append('\n');
				}
			} else {
				throw new Exception();
			}
		}
		System.out.println(sb);
	}
}