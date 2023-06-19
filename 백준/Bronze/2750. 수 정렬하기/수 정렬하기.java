import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1. BufferedReader을 통해 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 2. 배열을 이용하여 입력값 갖추기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 3. 정렬하기
        Arrays.sort(arr);

        // 4. 한 줄씩 출력하기
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}