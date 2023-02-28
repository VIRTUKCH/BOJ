import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

//        Scanner sc = new Scanner(System.in);
//        long a = sc.nextInt();
//        long b = sc.nextInt();
//        long c = sc.nextInt();

//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);

        System.out.println(a+b+c);
    }
}