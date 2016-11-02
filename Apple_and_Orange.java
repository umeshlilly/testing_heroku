package github;

import java.util.Scanner;

public class Apple_and_Orange {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int s = ss.nextInt();
		int t = ss.nextInt();
		int a = ss.nextInt();
		s = s-a;
		t = t-a;
		int b = ss.nextInt();
		b = b - a;
		int m = ss.nextInt();
		int n = ss.nextInt();
		int app[] = new int [m];
		int ans =0;
		for(int i =0;i<m;i++)
		{
			int now = ss.nextInt();
			if(now >=s && now<=t)
				ans++;
					
		}
		System.out.print(ans);
		ans = 0;
		for(int i =0;i<n;i++)
		{
			int now = ss.nextInt();
			now = now*-1;
			if(now >=s && now<=t)
				ans++;
					
		}
		System.out.print(ans);
			
		
		
	}

}
