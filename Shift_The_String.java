package github;

import java.util.Scanner;

public class Shift_The_String
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String data1 = s.nextLine();
		String data2 = s.nextLine();

		int ans = 0;
		int max = -1;
		for (int i = 0; i < data1.length(); i++) {
			int now_common = common_sub(data1, data2);
			if (now_common > max) {
				max = now_common;
				ans = i;
			}
			String tem = data2.substring(0, 1);
			data2 = data2.substring(1, data2.length()) + tem;
		}
		System.out.println(ans);

	}

	public static int common_sub(String data1, String data2) {
		for (int i = 0; i < data1.length(); i++) {
			if (data1.charAt(i) != data2.charAt(i)) {
				return i;
			}
		}
		return data1.length();
	}
}
