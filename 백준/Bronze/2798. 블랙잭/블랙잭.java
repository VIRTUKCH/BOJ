import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfCards = Integer.parseInt(st.nextToken());   // 카드의 총 개수
        int targetValue = Integer.parseInt(st.nextToken());     // 넘지 말아야 할 수

        // 1. 카드 초기화하기
        int[] cards = new int[numberOfCards];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st.nextToken());    // 각 카드의 숫자를 초기화 함
        }

        // ----- 여기까지 이상 없음 -----

        // 2. 세 장 합쳐서 최대의 수 찾기
        int max_sum = 0;
        int temp = 0;

        for (int i = 0; i < cards.length-2; i++) {
            for (int j = i+1; j < cards.length-1; j++) {
                for (int k = j+1; k < cards.length; k++) {
                    temp = cards[i] + cards[j] + cards[k];
                    if(temp <= targetValue && temp > max_sum) {
                        max_sum = temp;
                    }
                    temp = 0;
                }
            }
        }
        System.out.println(max_sum);
    }
}