import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] str = br.readLine().split(" ");
    	
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        
        
        //String sLine = "";
        int result = num1*num2;
        System.out.println(result);
    	
    	br.close();
	}
}
