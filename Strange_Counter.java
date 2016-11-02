package github;

import java.util.Scanner;

public class Strange_Counter
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		
		long ans =1;
		long i = 1;
		while(ans<n)
		{
			ans  =  3*ans;
//			i++;
			System.out.println(ans);
		}
				
		
			
		
		
	}

}
