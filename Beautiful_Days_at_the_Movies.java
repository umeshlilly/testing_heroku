package github;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Beautiful_Days_at_the_Movies
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		long ans = 0;
		for (long i = a; i <= b; i++) {
			long now = i;
			String s_now1 = String.valueOf(now);
			char[] s_now1_char = s_now1.toCharArray();
			char[] s_now1_char2 = s_now1.toCharArray();
			s_now1_char = rev(s_now1_char);
			String tem1 = new String(s_now1_char);
			String tem2 = new String(s_now1_char2);
			long num1 = Long.parseLong(tem1);
			long num2 = Long.parseLong(tem2);

//			System.out.println(s_now1);
//			disp(s_now1_char);
//			disp(s_now1_char2);
//			disp(s_now1_char);
//			System.out.println(tem1);
//			System.out.println(tem2);

			if (Math.abs(num1 - num2) % c == 0)
				ans++;

//			System.out.println(" jh");
		}
		System.out.println(ans);

	}

	public static void disp(char data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	public static char[] rev(char data[]) {
		
			char[] ans = new char[data.length];
			for (int i = 0; i < data.length; i++) {
				{
					ans[i] = data[data.length - 1 - i];
				}
			}
		return ans;
	}

}
