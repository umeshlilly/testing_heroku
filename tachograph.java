package github;

import java.util.Scanner;

public class tachograph
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long ans =0;
		for(long i=0;i<n;i++)
		{
			ans = ans + (s.nextLong()*s.nextLong());
		}
		System.out.println(ans);
		
	}

}
