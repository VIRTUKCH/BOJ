import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 포켓몬 마리 수
        int M = Integer.parseInt(st.nextToken()); // 문제의 개수

        HashMap<String, Integer> nameToIndex = new HashMap<>();
        String[] indexToName = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            nameToIndex.put(name, i);
            indexToName[i] = name;
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                int index = Integer.parseInt(input);
                sb.append(indexToName[index]).append("\n");
            } else {
                sb.append(nameToIndex.get(input)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
