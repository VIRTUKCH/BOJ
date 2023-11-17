import javax.xml.parsers.SAXParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                integerArrayList.add(i);
            }
        }

        try {
            System.out.println(integerArrayList.get(idx-1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(0);
        }

    }
}