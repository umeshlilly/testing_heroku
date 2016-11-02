package github;

import java.util.Arrays;
import java.util.Scanner;

public class Dot_Products_1
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data1[] = new int[n];
		int data2[] = new int[n];
		int neg1 = 0;
		int neg2 = 0;
		for (int i = 0; i < n; i++) {
			data1[i] = s.nextInt();
			if (data1[i] < 0)
				neg1++;
		}
		for (int i = 0; i < n; i++) {
			data2[i] = s.nextInt();
			if (data1[i] < 0)
				neg2++;
		}
		Arrays.sort(data1);
		Arrays.sort(data2);
		if (neg1 > neg2) {
			long ans = 0;
			for (int i = 0; i < neg2; i++) {
				ans = ans + data2[i] * data1[data1.length - 1 - i];
				System.out.println(ans);
			}
			int now = 0;
			System.out.println();
			for (int i = neg2; i < data2.length; i++) {
				ans = ans + data2[i] * data1[now];
				System.out.println(ans);
				now++;
			}
			System.out.println(ans);
		} else {
			System.out.println("j");
			long ans = 0;
			for (int i = 0; i < neg1; i++) {
				ans = ans + data2[data2.length - 1 - i] * data1[i];
				System.out.println(ans);
			}
			int now = 0;
			System.out.println();
			for (int i = neg1; i < data1.length; i++) {
				ans = ans + data2[now] * data1[i];
				System.out.println(ans);
				now++;
			}
			System.out.println(ans);

		}

	}

}
