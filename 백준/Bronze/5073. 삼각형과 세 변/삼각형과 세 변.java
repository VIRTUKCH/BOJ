import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            if(str.equals("0 0 0")) {
                return;
            }
            StringTokenizer st = new StringTokenizer(str);
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            while (st.hasMoreTokens()) {
                integerArrayList.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(integerArrayList);

            int a = integerArrayList.get(0);
            int b = integerArrayList.get(1);
            int c = integerArrayList.get(2);


            if(a == b && b == c) { // 1. 정삼각형인 경우
                System.out.println("Equilateral");
            } else if (c >= a + b) { // 2. 삼각형이 될 수 없는 경우
                System.out.println("Invalid");
            } else if (a == b || b == c || a == c) { // 3. 이등변삼각형인 경우
                System.out.println("Isosceles");
            } else { // 4. 일반적인 삼각형인 경우
                System.out.println("Scalene");
            }
        }
    }
}