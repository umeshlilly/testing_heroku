package github;

import java.util.Scanner;

public class Append_and_Delete
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		String data2 = s.nextLine();
		int k = Integer.parseInt(s.nextLine());
		int common = 0;
		for (int i = 0; i < Math.min(data1.length(), data2.length()); i++) {
			if (data1.charAt(i) != data2.charAt(i)) {
				common = i;
				break;
			}
		}
		if (data1.equals(data2))
			common = data1.length();
		String data11 = data1.substring(common, data1.length());
		String data22 = data2.substring(common, data2.length());
		// System.out.println(data1);
		// System.out.println(data2);
		// System.out.println(data1.length() + data2.length());
		// System.out.println(k % 2);
		if (sol(data1, data2, data11, data22, k))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	public static boolean sol(String data1, String data2, String data11, String data22, int k) {

		if (data1.length() + data2.length() <= k)
			return true;
		if (data11.length() + data22.length() == k)
			return true;
		if (data11.length() + data22.length() > k)
			return false;
		if (data11.length() + data22.length() == 0) {
			if (k % 2 == 0)
				return true;
			else
				return false;
		}

		if (data11.length() + data22.length() < k) {
			int tem = k;
			tem = tem - data11.length() - data22.length();
			if (tem % 2 == 0)
				return true;
			else
				return false;

		}

		return false;
	}

}
