package github;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lily_s_Homework
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int data[] = new int[t];
		int tem[] = new int[t];
		Map<Integer, Integer> keys = new HashMap<>();
		for (int i = 0; i < t; i++) {
			data[i] = s.nextInt();
			tem[i] = data[i];
			keys.put(data[i], i);

		}

		Arrays.sort(data);
		int count = 0;
		while (true) {
			int che = 0;
			for (int i = 0; i < data.length; i++) {
				if (data[i] != tem[i]) {

					int tem_num = keys.get(tem[i]);
					int tem_num1 = tem[i];
					tem[i] = data[i];
					tem[tem_num]  = tem_num1;
//				keys.
					
					che = 1;
				}
				if (che == 0)
					break;
			}

		}

	}

	public static void disp(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
