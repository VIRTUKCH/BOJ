import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] charArr = new char[5][15];

        // 1. 다섯 개의 문자열을 입력 받는다.
        for (int i = 0; i < 5; i++) {
            charArr[i] = new char[15];
            charArr[i] = br.readLine().toCharArray();
        }

        // 2. 세로로 읽는다.
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                try{
                    System.out.print(charArr[j][i]);
                } catch (Exception e) {
                    ;
                }
            }
        }

    }
}