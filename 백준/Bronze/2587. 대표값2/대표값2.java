import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        // 1. 평균 구하기
        int sum = 0;
        for (int value : arrayList) {
            sum += value;
        }
        System.out.println(sum / 5);

        // 2. 중앙값 구하기
        Collections.sort(arrayList);
        System.out.println(arrayList.get(2));

    }
}