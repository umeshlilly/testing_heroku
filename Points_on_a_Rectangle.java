package github;

import java.util.Scanner;

public class Points_on_a_Rectangle
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int ii = 0; ii < n; ii++) {
			int q = s.nextInt();
			int x[] = new int[q];
			int y[] = new int[q];
			int min_x = 10001;
			int max_x = -10001;
			int min_y = 10001;
			int max_y = -10001;
			for (int i = 0; i < q; i++) {
				x[i] = s.nextInt();
				y[i] = s.nextInt();
				if (min_x > x[i])
					min_x = x[i];
				if (max_x < x[i])
					max_x = x[i];
				if (min_y > y[i])
					min_y = y[i];
				if (max_y < y[i])
					max_y = y[i];
			}
//			System.out.println(min_x+" "+max_x);
//			System.out.println(min_y+" "+max_y);
			int che = 0;
			for (int i = 0; i < q; i++) {
				int xx = x[i];
				int yy = y[i];

				if (xx == min_x || xx == max_x) {
					if (yy > max_y || yy < min_y) {
						che = 1;
						break;
					}
				} else if (yy == max_y || yy == min_y) {
					if (xx > max_x || xx < min_x) {
						che = 1;
						break;
					}
				} else {
					che = 1;
					break;
				}

			}
			if (che == 1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}
