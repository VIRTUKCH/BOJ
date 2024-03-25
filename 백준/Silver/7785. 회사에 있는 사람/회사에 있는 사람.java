import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if(!treeSet.contains(name) && log.equals("enter")) {
                treeSet.add(name);
            }

            if(treeSet.contains(name) && log.equals("leave")) {
                treeSet.remove(name);
            }
        }
        List<String> list = new ArrayList<>(treeSet);
        Collections.reverse(list);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String str : list) {
            bw.write(str);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}