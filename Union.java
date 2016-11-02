package github;

import java.util.Scanner;

public class Union
{

	public static void main(String[] args) { /// care about indexing
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = i;
		}
		disp(data);
		int m = s.nextInt();
		for (int i = 0; i < m; i++) {

			int x = s.nextInt();
			int y = s.nextInt();

			int now = data[x];
			for (int j = 0; j < data.length; j++) {
				if (data[j] == now)
					data[j] = data[y];
			}

			disp(data);
		}

	}

	public static void disp(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
