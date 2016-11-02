package github;

import java.util.Scanner;

public class Laz_Mayor_and_Lasers
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		int m = s.nextInt();
		int data1[] = new int[m];
		for (int i = 0; i < m; i++) {
			data1[i] = s.nextInt();
		}

		int left = 0;
		for (int i = 0; i < m; i++) {
			int now = 1;
			for (int j = data1[i] - 2; j >= left; j--) {
				data[j] = now;
				now++;
			}
			left = data1[i] - 1;
		}
		int ans = 0;
		for (int i = 0; i < data.length; i++) {
			ans = ans + data[i];
		}
		// disp(data);
		System.out.println(ans);

	}

	public static void disp(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
