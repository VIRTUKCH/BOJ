import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // n번째로 작은 수를 출력하자.
        int cnt=0;

        // 1. 666부터 무한대까지, 만약 연속된 666이 들어가는 수라면 리스트에 추가한다.
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 666; i < Integer.MAX_VALUE; i++) {
            String str = String.valueOf(i);
            if(str.contains("666")) {
                integerArrayList.add(Integer.parseInt(str));
                cnt++;
            }

            if(cnt == n) {
                System.out.println(integerArrayList.get(n-1));
                return;
            }
        }
    }
}