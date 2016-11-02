package github;

import java.util.Scanner;

public class Between_Two_Sets
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int data1[] = new int[n];
		int data2[] = new int[m];
		int max = -1;
		int min = 101;
		for (int i = 0; i < n; i++) {
			data1[i] = s.nextInt();
			if (max < data1[i])
				max = data1[i];
		}
		for (int i = 0; i < m; i++) {
			data2[i] = s.nextInt();
			if (min > data2[i])
				min = data2[i];
		}
		int ans = 0;
		for (int i = max; i <= min; i++) {
			if (isTrue1(i, data1) && isTrue2(i, data2)) {
				ans++;
			}
		}
		System.out.println(ans);

	}

	public static boolean isTrue1(int n, int data[]) {
		for (int i = 0; i < data.length; i++) {
			if (n % data[i] != 0)
				return false;
		}
		return true;
	}

	public static boolean isTrue2(int n, int data[]) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] % n != 0)
				return false;
		}
		return true;
	}
}
