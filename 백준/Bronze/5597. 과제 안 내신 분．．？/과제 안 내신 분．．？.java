import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 입력 받은 28개의 원소를 가진 정수 리스트
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        // 2. 정렬해 주고
        Collections.sort(arrayList);

        // 3. 1부터 30까지 올바르게 정렬된 값이 들어간 sortedArrayList
        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            sortedArrayList.add(i);
        }

        // 4. 30짜리와 28짜리 겹치는 것을 0으로 바꿔 버리자
        for (int value: arrayList) {
            sortedArrayList.set(value - 1, 0);
//            int index = sortedArrayList.indexOf(value);
//            if (index != -1) {
//                sortedArrayList.set(index, 0);

//            sortedArrayList.set(sortedArrayList.indexOf(value - 1), 0);

        }
//        System.out.println(sortedArrayList);

        for (int value:sortedArrayList) {
            if(value != 0) {
                System.out.println(value);
            }
        }
    }
}