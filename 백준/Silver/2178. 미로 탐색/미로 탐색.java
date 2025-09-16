import java.util.*;
import java.io.*;

public class Main {

	public static int[][] map;
	public static boolean[][] visited;
	public static Queue<int[]> queue;
	public static int count;

	static int n;
	static int m;

	static int[] dx = new int[] {-1, 1, 0, 0};
	static int[] dy = new int[] {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		// init variables
		map = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		queue = new LinkedList<>();

		// get input
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			for (int j = 1; j <= m; j++) {
				map[i][j] = str.charAt(j-1) - '0';
			}
		}

		BFS(1, 1);
		System.out.println(map[n][m]);

		//for (int i = 0; i <= n; i++) {
		//	System.out.println(Arrays.toString(map[i]));
		//}
	}

	public static void BFS(int x, int y) {

		if ((x == n && y == m) || visited[x][y] == true) {
			return;
		}

		queue.add(new int[] {x, y});
		visited[x][y] = true;
		count++;
		map[x][y] = count;

		while(queue.isEmpty() == false) {
			int[] poll = queue.poll();

			
			for (int i = 0; i < 4; i++) {
				int nx = poll[0] + dx[i];
				int ny = poll[1] + dy[i];
			
				if (nx < 1 || nx > n || ny < 1 || ny > m) {
					continue;
				}

				if (visited[nx][ny] == true || map[nx][ny] == 0) {
					continue;
				}

				queue.add(new int[] {nx, ny});
				visited[nx][ny] = true;
				map[nx][ny] = map[poll[0]][poll[1]] + 1;
			}
		}
	}
}