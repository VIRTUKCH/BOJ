import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if(str.equals("0 0 0")){
                break;
            }
            StringTokenizer st = new StringTokenizer(str);
            int[] intArr = new int[3];
            for (int i = 0; i < 3; i++) {
                intArr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(intArr);
            int a = intArr[0];
            int b = intArr[1];
            int c = intArr[2];
            if(c * c == (a * a + b * b)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}