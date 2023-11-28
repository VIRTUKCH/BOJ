import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 들어오는 배열의 사이즈를 입력 받는다.
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 2. 8x8 사이즈의 배열을 생성한다.
        boolean[][] booleanArrResult = new boolean[8][8];
        for (int i = 0; i < 8; i++) {
            booleanArrResult[i] = new boolean[8];
        }

        // 3. 미리 생성한 배열에, B와 W의 값을 Boolean 값으로 변환하여 저장한다.
        boolean[][] booleanArrProvided = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            booleanArrProvided[i] = new boolean[N];
        }

        for (int i = 0; i < M; i++) {
            char[] temp = new char[N];
            temp = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                if (temp[j] == 'B') {
                   booleanArrProvided[i][j] = true;
                } else {
                    booleanArrProvided[i][j] = false;
                }
            }
        }

        // 4. 미리 W B W B 형태의 배열을 하나 만들어 놓는다.
        boolean[][] booleanArrPerfect = new boolean[8][8];
        for (int i = 0; i < 8; i++) {
            booleanArrPerfect[i] = new boolean[8];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                    booleanArrPerfect[i][j] = true;
                } else {
                    booleanArrPerfect[i][j] = false;
                }
            }
        }

        // 5. 3번에서 미리 만든 배열과 다를 때마다 cnt를 하나씩 늘리고, 옆으로 한 칸씩 옮겨 가면서 테스트한다. -> 최소값 출력 (A or 64-A 중 더 작은 값을 저장한다.)
        int min = Integer.MAX_VALUE;
        int cnt=0;
        for (int i = 0; i < M-7; i++) {
            for (int j = 0; j < N-7; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if(booleanArrProvided[k+i][l+j] == booleanArrPerfect[k][l]) {
                            cnt++;
                        }
                    }
                }
                if (min > cnt || min >= 64 - cnt) {
                    min = Math.min(cnt, 64 - cnt);
                }
                cnt=0;
            }
        }

        // 6. 출력한다.
        System.out.println(min);
    }
}