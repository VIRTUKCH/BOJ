import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = 10;
        char[] charArr = br.readLine().toCharArray();
        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] == charArr[i-1]) {
                len+=5;
            } else {
                len+=10;
            }
        }
        System.out.println(len);
    }
}