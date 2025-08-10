import java.util.*;
import java.io.*;

public class Main {

	public static List<List<Integer>> list;
	public static boolean[] visited;
	public static Queue<Integer> queue;
	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		// init
		list = new ArrayList<>();
		
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		visited = new boolean[n+1];
		queue = new LinkedList<>();

		// input
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list.get(a).add(b);
			list.get(b).add(a);
		}

		for (int i = 0; i <= n; i++) {
			Collections.sort(list.get(i));
		}

		DFS(v);
		visited = new boolean[n+1];
		sb.append("\n");
		BFS(v);
		System.out.println(sb);
	}

	public static void DFS(int indexOfNode) {
		if (visited[indexOfNode] == true) {
			return;
		}

		visited[indexOfNode] = true;
		sb.append(indexOfNode).append(" ");

		for (int indexOfNextNode : list.get(indexOfNode)) {
			DFS(indexOfNextNode);
		}
	}

	public static void BFS(int indexOfNode) {
		queue.add(indexOfNode);
		visited[indexOfNode] = true;

		while (queue.isEmpty() == false) {
			int poll = queue.poll();
			visited[poll] = true;
			sb.append(poll).append(" ");

			for (int indexOfNextNode : list.get(poll)) {
				if (visited[indexOfNextNode] == true) {
					continue;
				} else {
					queue.add(indexOfNextNode);
					visited[indexOfNextNode] = true;
				}
			}
		}		
	}
}