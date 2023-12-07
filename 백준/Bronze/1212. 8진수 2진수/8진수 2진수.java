import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.equals("0")) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        char c = str.charAt(0);
        switch ((int) (c - 48)) {
            case 1:
                sb.append(1);
                break;
            case 2:
                sb.append(10);
                break;
            case 3:
                sb.append(11);
                break;
            case 4:
                sb.append(100);
                break;
            case 5:
                sb.append(101);
                break;
            case 6:
                sb.append(110);
                break;
            case 7:
                sb.append(111);
                break;
        }
//        System.out.println("sb = " + sb);

        for (int i = 1; i < str.length(); i++) {
            char n = Character.valueOf(str.charAt(i));
            switch ((int) (n-48)) {
                case 0:
                    sb.append("000");
                    break;
                case 1:
                    sb.append("001");
                    break;
                case 2:
                    sb.append("010");
                    break;
                case 3:
                    sb.append("011");
                    break;
                case 4:
                    sb.append(100);
                    break;
                case 5:
                    sb.append(101);
                    break;
                case 6:
                    sb.append(110);
                    break;
                case 7:
                    sb.append(111);
                    break;
            }
        }
        System.out.println(sb);
    }
}