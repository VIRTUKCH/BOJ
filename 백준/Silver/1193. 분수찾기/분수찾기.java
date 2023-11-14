import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        if(input == 1) {
            System.out.println(1 + "/" + 1);
            return;
        }

        /*
        i == 1 => 1                  => 1                  : 내림차순
        sum = 0

        i == 2 => 2, 3               => 1, 2               : 오름차순
        sum = 1

        i == 3 => 4, 5, 6            => 3, 2, 1            : 내림차순
        sum = 3

        i == 4 => 7, 8, 9, 10        => 1, 2, 3, 4         : 오름차순
        sum = 6

        i == 5 => 11, 12, 13, 14, 15 => 5, 4, 3, 2, 1      : 내림차순
        sum = 10
         */

        // 0. 몇 번째에 해당하는지 인덱스 계산하기
        int i = 0;
        while (true) {
            if (2 * input < i * (i+1) + 1) {
                break;
            }
            i++;
        }
        

        int sum = 0; // 지금까지 인덱스의 합

        for (int j = 1; j < i; j++) {
            sum += j;
        }
        
//        System.out.println("input = " + input);
//        System.out.println("i = " + i);
//        System.out.println("sum = " + sum);

        int front = 0;
        // 1. 인덱스를 활용해서, 앞자리 출력
        if (i % 2 == 0) { // 오름차순으로 출력할 수 있게. 1, 2, 3, 4, ... i
            // 7 -> 1 / 8 -> 2 / 9 -> 3 / 10 -> 4 => 왜 6을 빼는가? = 1 + 2 + 3
//            System.out.println("sum = " + sum);
            front = input - sum;
        } else { // 내림차순으로 출력할 수 있게. i, i-1, ... , 1
            // 11 -> 5 / 12 -> 4 / 13 -> 3 / 14 -> 2 / 15 -> 1
//            System.out.println("sum = " + sum);
            front = i - (input - sum) + 1; // input이 11, sum이 10, i가 5
        }
        System.out.print(front);

        // 2. 슬래시 출력
        System.out.print("/");

        // 3. 뒷자리 출력
        int back = 0;
        if (i % 2 == 1) { // 오름차순으로 출력할 수 있게. 1, 2, 3, 4, ... i
            // 7 -> 1 / 8 -> 2 / 9 -> 3 / 10 -> 4 => 왜 6을 빼는가? = 1 + 2 + 3
            back = input - sum;
        } else { // 내림차순으로 출력할 수 있게. i, i-1, ... , 1
            // 11 -> 5 / 12 -> 4 / 13 -> 3 / 14 -> 2 / 15 -> 1
            back = i - (input - sum) + 1; // input이 11, sum이 10, i가 5
        }
        System.out.print(back);
    }
}