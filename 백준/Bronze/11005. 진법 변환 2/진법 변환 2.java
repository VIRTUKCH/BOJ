import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Stack<Character> characterStack = new Stack<>();
        while(number != 0) {
            if(number % N >= 0 && number % N <= 9) {
                characterStack.add((char) (number % N + 48));
            } else {
                characterStack.add((char) (number % N + 55));
            }
            number /= N;
        }
        while(!characterStack.isEmpty()) {
            System.out.print(characterStack.pop());
        }
    }
}