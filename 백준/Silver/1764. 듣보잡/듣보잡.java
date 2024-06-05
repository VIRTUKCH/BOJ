import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if(hashSet.contains(str)) {
                cnt++;
                stringList.add(str);
            }
        }
        Collections.sort(stringList);

        for (String str : stringList) {
            sb.append(str).append("\n");
        }

        System.out.println(cnt);
        System.out.println(sb);
    }
}