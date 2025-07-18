import java.util.*;
import java.io.*;

public class Main{

        static ArrayList<Integer>[] A;  // 인접연결리스트
        static boolean visited[];       // 방문했는가?

        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int N = Integer.parseInt(st.nextToken());       // node
                int M = Integer.parseInt(st.nextToken());       // edge

                A = new ArrayList[N+1];
                visited = new boolean[N+1];

                for (int i = 1; i < N + 1; i++) {
                        A[i] = new ArrayList<>();
                }

                // setting!
                for (int i = 0; i < M; i++) {
                        st = new StringTokenizer(br.readLine());
                        int u = Integer.parseInt(st.nextToken());
                        int v = Integer.parseInt(st.nextToken());

                        // add on ArrayList
                        A[u].add(v);
                        A[v].add(u);
                }

                // solve!
                int count = 0;
                for (int i = 1; i < N + 1; i++) {
                        if (!visited[i]) {
                                count++;
                                DFS(i);
                        }
                }
                System.out.println(count);
        }

        static void DFS(int v) {
                if (visited[v]) {
                        return;
                }

                visited[v] = true;

                for (int i : A[v]) {
                        if (visited[i] == false) {
                                DFS(i);
                        }
                }
        }
}