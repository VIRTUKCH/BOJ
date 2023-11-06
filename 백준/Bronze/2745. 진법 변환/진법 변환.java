import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception { // 코드 너무 더러워서 수정할 생각
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. n진법으로 바꿀 문자열은 str
        String str = st.nextToken();

        // 2. n진법에서 n에 해당하는 정수
        int n = Integer.parseInt(st.nextToken());

        // 3. 최종적인 결괏값은 result에 저장한다.
        int result = 0;

        // 4. 한 문자씩 처리해야지
        for (int i = 0; i < str.length(); i++) {
            // 4-1. 뒤에 있는 문자부터 따 내야 한다.
            char ch = str.charAt(str.length() - 1 - i);
            // 4-2. 이제 문자를 숫자로 바꿔야 하는데, 몇진법인가에 따라서 다를 수 있는 게 아니다.
            int chToInt = 0;
            if(ch >= 'A' && ch <= 'Z') { // 대문자 영어면 그에 맞게 변환하고
                chToInt = ch - 55;
            } else {
                chToInt = ch - 48; // 숫자면 또 그에 맞게 변환하고
            }
            // 4-3. 진법의 위치에 맞게 변환해 나가야 한다.
            // ex) 10101 2진법 -> 1*2^0 + 0*2^1 + 1*2^2 + ...
            result += chToInt * (int) Math.pow(n, i);
        }
        System.out.println(result);
    }
}