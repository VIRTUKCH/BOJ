import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double brokenString = Integer.parseInt(st.nextToken());
        int numOfBrand = Integer.parseInt(st.nextToken());

        int result = Integer.MAX_VALUE;
        int priceOfCheapestPackage = Integer.MAX_VALUE; // 1. 한 팩의 최저가 찾기
        int priceOfCheapestOneLine = Integer.MAX_VALUE; // 2. 한 줄의 최저가 찾기

        for (int i = 0; i < numOfBrand; i++) { // 최저가를 갱신하는 절차
            st = new StringTokenizer(br.readLine());
            int priceOfPackage = Integer.parseInt(st.nextToken());
            int priceOfOneLine = Integer.parseInt(st.nextToken());

            if (priceOfCheapestOneLine > priceOfOneLine) {
                priceOfCheapestOneLine = priceOfOneLine;
            }

            if (priceOfCheapestPackage > priceOfPackage) {
                priceOfCheapestPackage = priceOfPackage;
            }
        }

        if (((int) (brokenString / 6) + 0.99) * priceOfCheapestPackage // 1. 패키지를 하나 더 사는 게 나으면, 패키지를 사는 게 낫다.
                <= (int) (brokenString / 6) * priceOfCheapestPackage + ((int) brokenString % 6) * priceOfCheapestOneLine) {
            result = (int) ((brokenString / 6) + 0.99) * priceOfCheapestPackage;
//            System.out.println(1);
        } else if (priceOfCheapestPackage <= 6 * priceOfCheapestOneLine) { // 2. 패키지 < 여섯 줄이면 패키지 + 낱개 줄을 사시고
            result = (int) ((priceOfCheapestPackage * (int) (brokenString / 6) + priceOfCheapestOneLine * (brokenString % 6)));
//            System.out.println(2);
//            System.out.println("priceOfCheapestPackage = " + priceOfCheapestPackage);
//            System.out.println("priceOfCheapestOneLine = " + priceOfCheapestOneLine);
//            System.out.println("brokenString = " + brokenString);
        }
        else { // 3. 아니면 패키지 > 여섯 줄이면 -> 그냥 낱개로 사요
                result = (int) (priceOfCheapestOneLine * brokenString);
//                System.out.println(3);
            }

            System.out.println(result);
        }
    }