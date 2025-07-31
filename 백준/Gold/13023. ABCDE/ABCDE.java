import java.util.*;
import java.io.*;

public class Main {

	public static List<List<Integer>> list;
	public static boolean[] visited;
	public static boolean flag;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// init list
		list = new ArrayList<>();

		// init boolean array
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}

		// input
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list.get(a).add(b);
			list.get(b).add(a);
		}

		// visit
		for (int i = 0; i < n; i++) {
			DFS(i, 0);
			if (flag == true) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}

	public static void DFS(int indexOfNode, int depth) {
		if (visited[indexOfNode] == true) {
			return;
		}

		if (depth == 4) {
			flag = true;
			return;
		}

		visited[indexOfNode] = true;
		depth++;

		// next node
		List<Integer> nextNodeList = list.get(indexOfNode);
		for (int nextNodeIndex : nextNodeList) {
			DFS(nextNodeIndex, depth);
		}

		visited[indexOfNode] = false;
	}
}
