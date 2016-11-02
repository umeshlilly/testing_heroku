package github;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Prime_Palindromes
{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> prime = new ArrayList<>();
		prime.add(2);
		prime.add(3);
		int ans = 5;
		while (true) {
			int ch = 0;
			for (int i = 0; i < prime.size(); i++) {
				if (ans % prime.get(i) == 0) {
					ch = 1;
					break;
				}
			}
			if (ch == 0)
				prime.add(ans);
			if (ans > n && isPalindrome(ans)) {
				System.out.println(ans);
				break;
			}

			ans = ans + 2;
		}

	}

	public static boolean isPalindrome(int data1) {
		String data = String.valueOf(data1);
		for (int i = 0; i < data.length() / 2; i++) {
			if (data.charAt(i) != data.charAt(data.length() - 1 - i))
				return false;
		}
		return true;
	}

}
