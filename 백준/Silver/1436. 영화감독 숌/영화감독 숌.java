import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // n번째로 작은 수를 출력하자.

        // 1. 666부터 무한대까지, 만약 연속된 666이 들어가는 수라면 리스트에 추가한다.
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 666; i < Integer.MAX_VALUE; i++) {
            String str = String.valueOf(i);
            if(str.contains("666")) {
                integerArrayList.add(Integer.parseInt(str));
            }
//            // 1-1. 정수를 charArr의 형태로 바꾼다.
//            char[] charArr = Integer.toString(i).toCharArray();
//
//            // 1-2. charArr에 있는 수가 연속된 세 개의 6을 가지고 있다면, 정수로 바꿔서 리스트에 추가하자.
//            for (int j = charArr.length-1; j >= 2; j--) {
//                if(charArr[j] == '6' && charArr[j-1] == '6' && charArr[j-2] == '6') {
//                    integerArrayList.add(Integer.parseInt(String.valueOf(charArr)));
//                    break;
//                }
//
//            }

            if(integerArrayList.size() > n * 2 && integerArrayList.size() > 10) {
                System.out.println(integerArrayList.get(n-1));
                return;
            }
        }
    }
}