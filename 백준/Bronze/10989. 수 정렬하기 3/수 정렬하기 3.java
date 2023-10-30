import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         ArrayList<Integer> arrayList = new ArrayList<>(); // 여기서 메모리 초과
//         아마 객체라서 그런 듯 함.

        int input = Integer.parseInt(br.readLine());
        int intarr[] = new int[input];

        for (int i = 0; i < input; i++) {
            intarr[i] = Integer.parseInt(br.readLine());
        }
//        Collections.sort(arrayList);
        Arrays.sort(intarr);

        StringBuilder sb = new StringBuilder();
        for (int value : intarr) { // 물론 여기도 바꿈
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}