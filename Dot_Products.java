package github;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dot_Products
{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data1[] = new int[n];
		int data2[] = new int[n];
		for (int i = 0; i < n; i++) {
			data1[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			data2[i] = s.nextInt();
		}
		Arrays.sort(data1);
		ArrayList<Integer> data1_pos = new ArrayList<>();
		ArrayList<Integer> data1_neg = new ArrayList<>();
		ArrayList<Integer> data2_pos = new ArrayList<>();
		ArrayList<Integer> data2_neg = new ArrayList<>();

		Arrays.sort(data2);
		for (int i = 0; i < n; i++) {
			if (data1[i] > 0)
				data1_pos.add(data1[i]);
			else
				data1_neg.add(data1[i]);
		}
		for (int i = 0; i < n; i++) {
			if (data2[i] > 0)
				data2_pos.add(data2[i]);
			else
				data2_neg.add(data2[i]);
		}
		// System.out.println(data1_neg);
		// System.out.println(data1_pos);
		// System.out.println(data2_neg);
		// System.out.println(data2_pos);
		long ans = 0;
		for (int i = 0; i < Math.min(data1_neg.size(), data2_pos.size()); i++) {
			ans = ans + (data1_neg.get(0) * data2_pos.get(data2_pos.size() - 1 - i));
			data1_neg.remove(0);
			data2_pos.remove(data2_pos.size() - 1);
		}
		// System.out.println(ans);
		for (int i = 0; i < Math.min(data1_pos.size(), data2_neg.size()); i++) {
			ans = ans + (data2_neg.get(0) * data1_pos.get(data1_pos.size() - 1 - i));
			data1_pos.remove(data1_pos.size() - 1 - i);
			data2_neg.remove(0);
		}
		// System.out.println(ans);
		ArrayList<Integer> tem1 = new ArrayList<>();
		ArrayList<Integer> tem2 = new ArrayList<>();

		for (int i = 0; i < data1_neg.size(); i++) {
			tem1.add(data1_neg.get(i));
		}
		for (int i = 0; i < data1_pos.size(); i++) {
			tem1.add(data1_pos.get(i));
		}
		for (int i = 0; i < data2_neg.size(); i++) {
			tem2.add(data2_neg.get(i));
		}
		for (int i = 0; i < data2_pos.size(); i++) {
			tem2.add(data2_pos.get(i));
		}
		for (int i = 0; i < tem1.size(); i++) {
			ans = ans + tem1.get(i) * tem2.get(i);
		}
		// System.out.println(tem1);
		// System.out.println(tem2);
		System.out.println(ans);

	}

}
