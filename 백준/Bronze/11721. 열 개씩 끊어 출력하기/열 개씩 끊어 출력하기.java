import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for (i = 0; i < str.length()/10; i++) {
            sb.append(str, i*10, i*10+10).append("\n");
        }
        sb.append(str, i*10, str.length());
        System.out.println(sb);
    }
}