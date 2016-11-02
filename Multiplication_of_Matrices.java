package github;

import java.util.Scanner;

public class Multiplication_of_Matrices
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int p = s.nextInt();
		int q = s.nextInt();
		int r = s.nextInt();
		int ss = s.nextInt();
		
		int z = s.nextInt();
		int y = s.nextInt();
		
		int ii = s.nextInt();
		int jj = s.nextInt();
		
		long ans =0;
		for(int i =1;i<=n;i++)
		{
			int left = ((p*ii) + (q*i))%z;
			int right =  ((r*i) + (ss*jj))%y;
//			System.out.println(left+" "+right);
			ans = ans + (left*right);
		}
		System.out.println(ans);

	}

}
