import java.util.*;
import java.io.*;

public class Main {

	static List<List<Integer>> list;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		list = new ArrayList<>();

		// 여기서 답안지 한 번 확인했음 (Syntax)
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			list.get(u).add(v);
			list.get(v).add(u);
		}

		visited = new boolean[N+1];

		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				DFS(i);
				count++;
			}
		}
		System.out.println(count);
	}

	static void DFS(int vertexIdx) {
		if (visited[vertexIdx]) {
			return;
		}

		visited[vertexIdx] = true;
		List<Integer> nextVertexList = list.get(vertexIdx);

		for (int nextVertexIdx : nextVertexList) {
			DFS(nextVertexIdx);
		}
	}
}