import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // input을 받는다.
		int num = input;
		int arr[] = new int[3]; // arr은 숫자를 둘로 쪼개기 위함임.
		int cnt=0; // 카운트는 1부터
		
		while(cnt == 0 || num != input) { // 입력받은 값과 계산값이 같을때까지 돌린다.
			arr[0] = num / 10;
			arr[1] = num % 10;
			arr[2] = arr[0] + arr[1];
			num = arr[1]*10 + arr[2]%10;
			cnt++;
		}
		System.out.println(cnt);
	}
}
