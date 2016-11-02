package github;

import java.util.Scanner;

public class Telescope
{

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		long m = s.nextLong();
		long n = s.nextLong();
		int ans =0;
		for(long i =0;i<n;i++)
		{
			if(s.nextLong()*m>=40000000)
				ans++;
		}
		System.out.println(ans);
		
		
	}

}
