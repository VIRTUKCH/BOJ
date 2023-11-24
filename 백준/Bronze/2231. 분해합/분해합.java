import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 1000000; i++) {
            int temp = i; // 템프에는 내가 분해하고 있는 수를 담는다.
            int len = 0;

            while(temp != 0) { // 1. 내가 분해하고 있는 수의 길이를 구한다.
                temp /= 10;
                len++;
            }

            temp = i; // 2. 길이만 구하는 게 목적이었으니, 다시 분해하고 싶은 수로 초기화

            // 3. 이제 합을 구해서 되는지 확인
            int sum = temp;
            for (int j = 0; j < len; j++) {
                sum += temp % 10; // 여기도 원래는 i를 넣어야 하나, 그럴 수 없게 되었으니 temp를 넣어.
                temp /= 10;
            }
//            System.out.print("sum = " + sum);
//            System.out.println("i = " + i);

            if(input == sum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}