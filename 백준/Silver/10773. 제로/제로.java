import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

import javax.imageio.metadata.IIOMetadataFormatImpl;

// Run Shortcut => Shift + Command + Function + F11
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int index = 0;
		int[] array = new int[N+1];
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			
			if(value != 0) {
				index ++;
				array[index] = value;
			} else {
				array[index] = 0;
				index --;
			}

//			System.out.println(Arrays.toString(array));
		}
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}
}