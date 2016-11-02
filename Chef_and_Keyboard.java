package github;

import java.util.Scanner;

public class Chef_and_Keyboard
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = s.nextInt();
			int m = s.nextInt();
			int c = s.nextInt();
			int ans = 0;
			for (int i = 1; i <= n; i++) {
				if (c % i == 0) {
					int now = c / i;
					if (now <= m)
						ans++;
				}
			}
			System.out.println(ans);

		}

	}

}
