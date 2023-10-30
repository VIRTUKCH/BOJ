import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < repeat; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arrayList);

        StringBuilder sb = new StringBuilder();

        for (int value: arrayList) {
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}