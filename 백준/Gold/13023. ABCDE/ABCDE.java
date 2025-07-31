import java.util.*;
import java.io.*;

public class Main {

        public static List<List<Integer>> list;
        public static boolean[] visited;
        public static boolean finishFlag;

        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());

                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                // init list
                list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                        list.add(new ArrayList<>());
                }

                // init boolean Array
                visited = new boolean[n];

                // init list 2 - 리스트에 원소 추가하기
                for (int i = 0; i < m; i++) {
                        st = new StringTokenizer(br.readLine());
                        int a = Integer.parseInt(st.nextToken());
                        int b = Integer.parseInt(st.nextToken());

                        list.get(a).add(b);
                        list.get(b).add(a);
                }

                // 이중 접점 리스트 점검 결과 이상 없음

                // depth 가 4이면 1을 출력해야 하고
                // 4 가 안 되는데 + 더 갈 곳도 없으면 return 해야 함
                // 일단 탐색을 다 하는 게 맞음

                for (int i = 0; i < n; i++) {
                        DFS(i, 0);
                        if (finishFlag == true) {
                                System.out.println(1);
                                return;
                        }
                }

                System.out.println(0);
                return;
        }

        public static void DFS(int indexOfNode, int depth) {
                if (visited[indexOfNode] == true) {
                        return;
                }

                if (depth == 4) {
                        finishFlag = true;
                        return;
                }

                visited[indexOfNode] = true;
                depth++;

                List<Integer> nextNodeList = list.get(indexOfNode);
                for (int nextNodeIndex : nextNodeList) {
                        DFS(nextNodeIndex, depth);
                }

                visited[indexOfNode] = false;
        }
}