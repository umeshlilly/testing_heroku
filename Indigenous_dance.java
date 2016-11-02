package github;

import java.util.Arrays;
import java.util.Scanner;

public class Indigenous_dance
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int data_main[] = new int[n];
		int data[] = new int[n];
		int dir[] = new int[n];
		for (int i = 0; i < m; i++) {
			int now = s.nextInt();
			data[now - 1] = 1;
			data_main[now-1] =1;
			dir[now - 1] = s.nextInt();
		}
		
		int ans =0;
		while(true)
		{
			for(int i =1;i<data.length-1;i++)
			{
			}
			
			
			
			if(Arrays.equals(data, data_main))
				break;
		}
		
		System.out.println(ans);

	}
	

}
