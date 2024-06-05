import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            if(!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number)+1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int nubmer = Integer.parseInt(st.nextToken());
            if(!map.containsKey(nubmer)) {
                sb.append("0").append(" ");
            } else {
                sb.append(map.get(nubmer) + " ");
            }
        }
        System.out.println(sb);
    }
}