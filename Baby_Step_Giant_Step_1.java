package github;

import java.util.Scanner;

public class Baby_Step_Giant_Step_1
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long q = s.nextLong();
		for (int ii = 0; ii < q; ii++) {
			long a = s.nextLong();
			long b = s.nextLong();
			long c = s.nextLong();
			if (c == 0)
				System.out.println("0");
			else {
				long aa = (a / c) - 1;
				long bb = (b / c) - 1;
				long min = (long) Math.pow(10, 15);
				for (long k = -aa; k <= bb; k++) {
					long tem = c - (a * k);
					if (tem % (b-a) == 0) {
						if ((2*(tem / (b-a))) - k < min)
							min = (2*(tem / (b-a)));
					}

				}
				System.out.println(min);
			}

		}

	}

}
