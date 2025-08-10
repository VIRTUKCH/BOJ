import java.util.*;
import java.io.*;

public class Main {

        public static List<List<Integer>> list;
        public static boolean[] visited;

        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int n = Integer.parseInt(st.nextToken()); // vertex
                int m = Integer.parseInt(st.nextToken()); // edge
                int v = Integer.parseInt(st.nextToken()); // index of vertex

                // init list
                list = new ArrayList<>();
                for (int i = 0; i <= n; i++) {
                        list.add(new ArrayList<>());
                }

                visited = new boolean[n + 1];

                // get input and init list
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
                System.out.println();
                BFS(v);
        }

        public static void DFS(int indexOfNode) {
                if (visited[indexOfNode] == true) {
                        return;
                }

                visited[indexOfNode] = true;
                System.out.print(indexOfNode + " ");

                for (int indexOfNextNode : list.get(indexOfNode)) {
                        DFS(indexOfNextNode);
                }
        }

        public static void BFS(int indexOfNode) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(indexOfNode);
                visited[indexOfNode] = true;

                while (queue.isEmpty() == false) {
                        int targetNode = queue.poll();
                        System.out.print(targetNode + " ");


                        for (int indexOfNextNode : list.get(targetNode)) {
                                if (visited[indexOfNextNode] == false) {
                                        queue.add(indexOfNextNode);
                                        visited[indexOfNextNode] = true;
                                }
                        }
                }
        }
}