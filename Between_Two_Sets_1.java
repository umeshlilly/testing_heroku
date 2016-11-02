package github;

import java.util.Scanner;

public class Between_Two_Sets_1
{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int data1[] = new int[n];
		int data2[] = new int[m];
		
		int max = -1;
		int min = 101;
		for (int i = 0; i < n; i++) {
			data1[i] = s.nextInt();
			if (max < data1[i])
				max = data1[i];
		}
		for (int i = 0; i < m; i++) {
			data2[i] = s.nextInt();
			if (min > data2[i])
				min = data2[i];
		}
		
		int lcm = data1[0];
		for (int i = 0; i < n; i++) {
			int tem = gcd_Cal(lcm, data1[i]);
			lcm = (lcm * data1[i]) / tem;
		}
		
		int gcd = data2[0];
		for (int i = 1; i < m; i++) {
			gcd = gcd_Cal(gcd, data2[i]);
		}
		int ans = 0;
		int now  = 1;
		while(true)
		{
			int tem = now * lcm;
			if(gcd%tem==0)
				ans++;
			now++;
			if(tem>=min)
				break;
		}
		System.out.println(ans);
	}

	public static int gcd_Cal(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd_Cal(b, a % b);

	}
}
