package github;

import java.util.Scanner;

public class Sedex_Marciano
{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		d = 4 * d * d;
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		int mid = a + b + c - max - min;
		max = max * max;
		mid = mid * mid;
		if (d >= max + mid)
			System.out.println("S");
		else
			System.out.println("N");

	}

}
