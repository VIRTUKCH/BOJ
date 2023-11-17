import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        do {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0) {
                return;
            }

            if(isfactor(a,b)) {
                System.out.println("factor");
            } else if (ismultiple(a,b)) {
                System.out.println("multiple");
            } else if (isneither(a,b)) {
                System.out.println("neither");
            }
        } while (a != 0 && b != 0);
    }

    private static boolean isneither(int a, int b) {
        return (a%b != 0 && b%a !=0);
    }

    private static boolean ismultiple(int a, int b) { // b가 a의 약수인가?
        return a%b == 0;
    }

    private static boolean isfactor(int a, int b) { // a가 b의 약수인가?
        return b%a == 0;
    }
}