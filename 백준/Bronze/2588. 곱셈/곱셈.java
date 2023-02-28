import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());

        int firstResult = first * (second%10);
        int secondResult = first * ((second%100)/10);
        int lastResult = first * (second/100);

        System.out.println(firstResult);
        System.out.println(secondResult);
        System.out.println(lastResult);
        System.out.println(first*second);
    }
}