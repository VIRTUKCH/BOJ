import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int candidate = Integer.parseInt(st.nextToken());
        int cutLine = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " +");
        while (st.hasMoreTokens()) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arrayList); // 낮은 수부터 정렬
        Collections.reverse(arrayList); // 높은 수부터 먼저 나오게 (인덱스를 뒤에서 부터 접근하면 메모리 아낄 듯?)
        System.out.println(arrayList.get(cutLine-1));
    }
}