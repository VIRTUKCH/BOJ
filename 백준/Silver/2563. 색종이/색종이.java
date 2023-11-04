import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static void draw(boolean doHwaJi[][], int n, int m) {
        for (int i = n; i < n+10; i++) {
            for (int j = m; j < m+10; j++) {
                doHwaJi[i][j] = true;
            }
        }
    }

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] doHwaJi = new boolean[100][100]; // default는 false

        // 몇 줄 입력 받을지?
        int input = Integer.parseInt(br.readLine());
        StringTokenizer st;

        // 색칠
        for (int i = 0; i < input; i++) {
            st = new StringTokenizer(br.readLine());
            draw(doHwaJi, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        // 최종 카운트
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(doHwaJi[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}