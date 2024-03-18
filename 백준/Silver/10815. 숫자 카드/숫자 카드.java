import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 상근이 카드 집합에 박기
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            integerHashSet.add(Integer.parseInt(st.nextToken()));
        }
        
        // 2. 구해야 할 숫자 배열에 박기
        int M = Integer.parseInt(br.readLine());
        int[] checkCardArrays = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            checkCardArrays[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        // 3. 배열 탐색 + 집합에 있으면 1 없으면 0 반환하기
        for (int n : checkCardArrays) {
            if(integerHashSet.contains(n)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}