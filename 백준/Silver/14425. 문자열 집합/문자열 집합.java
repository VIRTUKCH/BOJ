import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 1. 비교의 대상은 Set에 넣어 두기.
        HashSet<String> stringHashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            stringHashSet.add(br.readLine());
        }

        // 2. 검사해야 할 문자열은 배열에 넣어 두기.
        String[] stringInputArrays = new String[M];
        for (int i = 0; i < M; i++) {
            stringInputArrays[i] = br.readLine();
        }

        int cnt = 0;
        // 3. 배열 탐색 + 집합에 있으면 1 없으면 0 반환하기
        for (String str : stringInputArrays) {
            if (stringHashSet.contains(str)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}