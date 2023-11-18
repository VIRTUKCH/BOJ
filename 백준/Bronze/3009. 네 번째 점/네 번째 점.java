import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] x = new int[4];
        int[] y = new int[4];

        ArrayList<Integer> x_arrayList = new ArrayList<>();
        ArrayList<Integer> y_arrayList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());

            if(!x_arrayList.contains(x[i])) {
                x_arrayList.add(x[i]);
            } else {
                x_arrayList.remove(x_arrayList.indexOf(x[i]));
            }

            if(!y_arrayList.contains(y[i])) {
                y_arrayList.add(y[i]);
            } else {
                y_arrayList.remove(y_arrayList.indexOf(y[i]));
            }
        }
        System.out.println(x_arrayList.get(0) + " " + y_arrayList.get(0));
    }
}