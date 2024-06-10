import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            int a = list.get(i);
            int b = list.get(i + 1);
            list2.add(Math.abs(a-b));
        }
//        System.out.println("list2 = " + list2);

        // list2 를 순회 -> 원소 두 개 뽑은 다음에 -> 최소 공약수를 구함.
        // 그 다음에 그 최소 공약수와 다음 원소를 비교해서 최소 공약수를 구함.
        // 그 최소 공약수를 result 라고 하자.

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < list2.size() - 1; i++) {
            int a = 0;
            int b = 0;
            int uclidResult = 0;
            if (i==0) {
                a = list2.get(i);
                b = list2.get(i+1);
                uclidResult = uclidSolution(a, b);
                if(uclidResult < result) {
                    result = uclidResult;
                }
            } else {
                b = list2.get(i+1);
                uclidResult = uclidSolution(result, b);
                if(uclidResult < result) {
                    result = uclidResult;
                }
            }
        }
//        System.out.println("result = " + result);

        // 지금부터 최대 공약수는 result 임.

        int listMaxValue = list.get(list.size() - 1);
        int listMinValue = list.get(0);


//        System.out.println("listMinValue = " + listMinValue);
//        System.out.println("listMaxValue = " + listMaxValue);
//        System.out.println("result = " + result);
//        System.out.println("list.size() = " + list.size());

        System.out.println(((listMaxValue - listMinValue) / result) - list.size() + 1);

    }

    public static int uclidSolution(int a, int b) { // 최대 공약수를 반환함
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a % b == 0) {
            return b;
        } else {
            return uclidSolution(b, a % b);
        }
    }
}
