import java.util.*;
import java.io.*;

public class Main {

	public static int[][] board;
	public static boolean[][][] visited;
	public static int[][][] dist;

	public static Queue<int[]> queue;
	public static int count;

	public static int n;
	public static int m;

	public static int[] dx = new int[] {-1, 1, 0, 0};
	public static int[] dy = new int[] {0, 0, -1, 1};

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		// init variables
		board = new int[n][m];
		visited = new boolean[n][m][2];
		dist = new int[n][m][2];
		queue = new LinkedList<>();
		count = 0;

		// get input
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				int c = str.charAt(j) - '0';
				board[i][j] = c;
			}
		}

		// print test
		//for (int i = 0; i < n; i++) {
		//	System.out.println(Arrays.toString(board[i]));
		//}

		BFS(0, 0);
		int ans0 = dist[n-1][m-1][0];
		int ans1 = dist[n-1][m-1][1];

		int result;
		if (ans0 == 0 && ans1 == 0) result = -1;
		else if (ans0 == 0) result = ans1;
		else if (ans1 == 0) result = ans0;
		else result = Math.min(ans0, ans1);

		System.out.println(result);

	}

	public static void BFS(int x, int y) {
		if (visited[x][y][0] == true) {
			count = -1;
			return;
		}

		visited[x][y][0] = true;
		queue.add(new int[]{x, y, 0});
		dist[x][y][0] = 1;

		while (queue.isEmpty() == false) {
			int[] poll = queue.poll();
			int px = poll[0];
			int py = poll[1];
			int broken = poll[2];

			//System.out.println("px : " + px + ", py : " + py + ", dist : " + dist[px][py][broken]);

			for (int i = 0; i < 4; i++) {
				int nx = px + dx[i];
				int ny = py + dy[i];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny][broken]) {
					continue;
				}

				// 1. 벽 아니지롱
				if (board[nx][ny] == 0 && visited[nx][ny][broken] == false) {
					visited[nx][ny][broken] = true;
					queue.add(new int[] {nx, ny, broken});
					dist[nx][ny][broken] = dist[px][py][broken] + 1;
				}

				// 2. 벽이지롱
				if (board[nx][ny] == 1 && broken == 0 && visited[nx][ny][1] == false) {
					visited[nx][ny][1] = true;
					queue.add(new int[] {nx, ny, 1});
					dist[nx][ny][1] = dist[px][py][broken] + 1;
				}
			}
		}
	}
}