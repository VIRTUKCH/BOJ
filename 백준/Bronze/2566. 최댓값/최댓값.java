import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] intarr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                intarr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int firstIdx = 0;
        int secondIdx = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(intarr[i][j] > max) {
                    max = intarr[i][j];
                    firstIdx=i;
                    secondIdx=j;
                }
            }
        }
        System.out.println(max);
        System.out.println(firstIdx + 1 + " " + (int) (secondIdx + 1));
    }
}