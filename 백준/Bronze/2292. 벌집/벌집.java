import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		int cnt=1, j=0;
		int[] index = new int[20000];
		
		for(int i=0; i<20000; i++)
		{
			j+=i;
			index[i] = 6*j+1;
			
			if(a > index[i]) // 각 기준마다 클 때마다 1씩 카운트를 늘린다.
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}