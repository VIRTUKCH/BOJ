import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();
        int result = 1;
        for (int i = 0; i < charArr.length / 2; i++) {
            if(charArr[i] != charArr[charArr.length-1-i]) {
                result = 0;
            }
        }
        System.out.println(result);
    }
}
