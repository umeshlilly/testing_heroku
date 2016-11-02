package github;

import java.util.Scanner;

public class Restaurant
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int l = s.nextInt();
			int b = s.nextInt();
			int now = 1;
			int pieces = 0;
			int min = Math.min(l, b);
			while (true) {
				int area = now * now;

				if ((l * b) % area == 0) {
					pieces = (l * b) / area;
					System.out.println(area + " a " + (l * b));
				}
				if (now == min) {
					System.out.println(pieces);
					break;
				}
				now++;
			}

		}

	}

}
