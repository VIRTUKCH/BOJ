
import java.util.*;
import java.io.*;

public class Main {

	public static int n;
	public static int m;

	public static int[][] map;
	public static Queue<int[]> queue;
	public static int[][][] dist;

	public static int[] dx = new int[] {-1, 1, 0, 0};
	public static int[] dy = new int[] {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());


		// init variables
		map = new int[n][m];
		queue = new LinkedList<>();
		dist = new int[n][m][2];

		// get input
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				int value = str.charAt(j) - '0';
				map[i][j] = value;
			}
		}

		// map print test
		//for (int[] array : map) {
		//	System.out.println(Arrays.toString(array));
		//}
		
		int result = BFS(0, 0, 0);
		System.out.println(result);
	}

	public static int BFS(int x, int y, int z) {
		queue.add(new int[] {x, y, z});
		dist[x][y][z] = 1;
		while(queue.isEmpty() == false) {
			int[] poll = queue.poll();
			int px = poll[0];
			int py = poll[1];
			int pz = poll[2];

			if (px == n-1 && py == m-1) {
				return dist[px][py][pz];
			}

			for (int i = 0; i < 4; i++) {
				int nx = px + dx[i];
				int ny = py + dy[i];
				int nz = pz;

				// can't go?
				if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}

				// visited?
				if (dist[nx][ny][nz] != 0) {
					continue;
				}

				// wall?
				if (map[nx][ny] == 1) {
					// not broke yet?
					if (pz == 0) {
						nz = 1;
						dist[nx][ny][nz] = dist[px][py][pz] + 1;
						queue.add(new int[]{nx, ny, nz});
					}

					// alreay broke?
					if (pz == 1) {
						continue;
					}
				}

				// not wall?
				if (map[nx][ny] == 0) {
					dist[nx][ny][nz] = dist[px][py][pz] + 1;
					queue.add(new int[]{nx, ny, nz});
				}
			}
		}
		return -1;
	}
}
