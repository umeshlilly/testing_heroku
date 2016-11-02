package github;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Print_all_possible_words_from_phone_digits_1
{

	private static int total;
	private static Map<String,Integer> final_ans = new HashMap();
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		sol(data, 0);
		System.out.println("sdjfhsldkjfhsdjhfj");
		System.out.println(final_ans.size());
		System.out.println(total);
	}

	public static void sol(int[] data, int n) {
		if (n == data.length)
			return;
		int now = data[n];
		for (int i = 1; i <= now; i++) {
			data[n] = i;
//			disp(data);
			conver(data);
			sol(data, n + 1);
			
		}

	}

	public static void disp(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

	}

	public static String conver(int[] data) {
		String pas = "";

		for (int i = 0; i < data.length; i++) {
			pas = pas + data[i];
		}
		final_ans.put(pas, 1);
		total++;
		return pas;
	}

}
