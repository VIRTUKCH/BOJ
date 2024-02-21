import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;
/*
 * 1. 정방형 배열을 입력받을 경우
 * 2. 비정방형 배열을 입력받을 경우
 * 3. 
 */


public class Main {
	static int[][] map = {
        {0, 1, 0, 1, 0, 1},
        {0, 1, 1, 1, 0, 1},
        {0, 0, 0, 1, 0, 1},
        {0, 1, 0, 1, 0, 1},
        {0, 1, 0, 0, 0, 0},
        {0, 0, 0, 1, 1, 0}
    };
	static int mazeSizeN; // 미로의 행 크기
	static int mazeSizeM; // 미로의 열 크기
	static boolean[][] visited; // 방문 여부를 기록하는 배열
	static int[] dx = { -1, 1, 0, 0 }; // 상하좌우 탐색을 편하게 하기 위한 인덱스
    static int[] dy = { 0, 0, -1, 1 }; // 상하좌우 탐색을 편하게 하기 위한 인덱스

	public static void main(String[] args) throws IOException {

		// 배열의 크기와 배열의 구조를 직접 입력 받는다고 하면..
		// <예시>
		// 3 3 (n, m)
		// 000
		// 010
		// 110
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		mazeSizeN = Integer.parseInt(st.nextToken());
		mazeSizeM = Integer.parseInt(st.nextToken());

		map = new int[mazeSizeN][mazeSizeM];
		for (int i = 0; i < mazeSizeN; i++) {
			String str = br.readLine();
			for (int j = 0; j < mazeSizeM; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		mazeSizeN = map.length;
		mazeSizeM = map[0].length; // 직사각형 형태의 배열이라는 가정 하에..
		// mazeSizeM = map.length; // 정방형 배열이라면

		visited = new boolean[mazeSizeN][mazeSizeM];
		for (int i = 0; i < mazeSizeN; i++) { // 별 의미는 없겠지만 계단식 배열도 처리 가능할 듯?
			visited[i] = new boolean[map[i].length];
		}
		
		bfs(0, 0);
		System.out.println(map[mazeSizeN - 1][mazeSizeM - 1]);
	}

	public static void bfs(int x, int y) {
        // 1. 너비 우선 탐색을 위해 좌표를 넣을 수 있는 int[] 형태의 Queue를 하나 만든다.  
		// Queue는 interface다. Queue 객체를 생성하기 위해서는,
		// Queue 인터페이스를 구현한 클래스인 LinkedList나 ArrayDeque 등을 사용해야 한다.
		Queue<int[]> q = new LinkedList<>();

        // 2. 시작 지점을 추가한다.
		q.add(new int[] {x,y});
		
        // 3. 큐가 빌 때까지 너비 우선 탐색을 진행한다.
		while(!q.isEmpty()) {

			// 3-1 : 현재 좌표를 Queue에서 뽑아 온다.
			// 시작할 때는 0,0이 들어 있다.
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) {				

				// 3-2 : 가까이에 있는 다음 노드를 찾는다.
				int nextX = nowX + dx[i]; // dx와 dy는 다음 노드를 쉽게 찾기 위한 배열이다.
				int nextY = nowY + dy[i];
				
				// 3-3 : 배열을 벗어났다면 잘못된 거다. 큐에 포함하지 않도록 반복문 탈출 조치를 취한다.
				if (nextX < 0 || nextY < 0 || nextX >= mazeSizeN || nextY >= mazeSizeM) {
					continue;
				}

				// 3-4 : 방문한 노드이거나, 벽이면 방문해서는 안 된다.
				if (visited[nextX][nextY] == true || map[nextX][nextY] == 0) {
					continue;
				}
			
				// 3-5 : 위의 제약 조건을 다 피한 노드라면, 방문해도 괜찮다.
				q.add(new int[] {nextX, nextY});

				// 3-6 : 가는 데 얼마나 걸렸는지 기록한다.
				map[nextX][nextY] = map[nowX][nowY] + 1;

				// 3-7 : 방문 기록을 남긴다.
				visited[nextX][nextY] = true;
			}
		}
	}
}