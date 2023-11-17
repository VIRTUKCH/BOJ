import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int a = Integer.parseInt(br.readLine());
            if(a == -1) {
                break;
            }
            isPerfectNumber(a, sb);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void isPerfectNumber(int a, StringBuilder sb) {
        int sum = 0;
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i < a; i++) {
            if(a % i == 0) {
                sum += i;
                integerArrayList.add(i);
            }
        }

        if(sum == a) {
            sb.append(a).append(" = ");
            for (int i = 0; i < integerArrayList.size(); i++) {
                if(i == integerArrayList.size() - 1) {
                    sb.append(integerArrayList.get(i));
                } else {
                    sb.append(integerArrayList.get(i)).append(" + ");
                }
            }
        } else {
            sb.append(a).append(" is NOT perfect.");
        }
    }
}