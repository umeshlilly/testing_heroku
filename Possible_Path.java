package github;

import java.util.Scanner;

public class Possible_Path
{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {

			long a = s.nextLong();
			long b = s.nextLong();
			long c = s.nextLong();
			long d = s.nextLong();

			if (gcd_Cal(a, b) == gcd_Cal(c, d))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static long gcd_Cal(long a, long b) {
		if (b == 0)
			return a;
		else
			return gcd_Cal(b, a % b);

	}

}
