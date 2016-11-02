package github;

import java.util.Scanner;

public class Problem_B_Family_Hotel
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long t = s.nextLong();
		for (int i = 0; i < t; i++) {
			long n = s.nextLong();
			long k = s.nextLong();
			long den = n - 1;
			long num = 0;
			if (k == 1 || k == n)
				num = den - 1;
			else
				num = den - 2;
			System.out.println(num+" "+den);
			long tem_ans = power_mod(num,1000000005,1000000007);
			System.out.println(tem_ans);
			
			
		}

	}

	
	public static String conv(long data, int base)
	{
		
		return (Long.toBinaryString(data));
	}
	public static long power_mod(long a,long b,long c)
	{
		a = a % c;
		String b_binary = conv(b, 2);
		long now = 1;
		for (int i = 0; i < b_binary.length(); i++)
		{
			if (b_binary.charAt(i) == '1')
			{
				now = now * now;
				now = now % c;
				now = now * a;
				now = now % c;
			} else
			{
				now = now * now;
				now = now % c;
			}
		}
		return now;
		
	}
	
	
}
