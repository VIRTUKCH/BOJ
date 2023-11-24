import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 1000000; i++) {
            int temp = i;
            char[] charArray = Integer.toString(i).toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                temp += (charArray[j]-48);
            }
            if(input == temp) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}