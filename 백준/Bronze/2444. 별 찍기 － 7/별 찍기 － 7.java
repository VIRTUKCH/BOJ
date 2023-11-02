import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        // 1. 윗쪽 삼각형을 그리고
        for (int i = 0; i < input-1; i++) {
            // 1-1. 스페이스바는 4, 3, 2, 1개
            for (int j = 0; j < input-i-1; j++) {
                System.out.print(" ");
            }
            // 1-2. 별은 1, 3, 5, 7개
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. 중간 별을 출력하고
        for (int i = 0; i < input*2-1; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 3. 아래 삼각형을 그리자
        for (int i = 0; i < input-1; i++) {
            // 3-1. 스페이스 바는 1, 2, 3, 4개
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            // 3-2 별은 7, 5, 3, 1개
            for (int j = 0; j < (input-i-1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
