import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine()) % 42;
            if(! integerArrayList.contains(n)) {
                integerArrayList.add(n);
            }
        }
        System.out.println(integerArrayList.size());
    }
}