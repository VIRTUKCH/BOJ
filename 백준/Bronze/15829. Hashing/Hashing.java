import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        BigInteger hash = new BigInteger("0");
        BigInteger r = new BigInteger("31");
        BigInteger mod = new BigInteger("1234567891");

        for (int i = 0; i < L; i++){
            BigInteger ch;
            ch = BigInteger.valueOf((str.charAt(i)-'a')+1);

            hash = hash.add(r.pow(i).mod(mod).multiply(ch));
        }
        System.out.println(hash.mod(mod));
    }
}