package github;

import java.util.Arrays;
import java.util.Scanner;

public class Luck_Balance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int data[] = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int now1 = s.nextInt();
			int now2 = s.nextInt();
			if (now2 == 0)
				ans = ans + now1;
			else {
				data[i] = now1;
			}
		}
//		System.out.println(ans);
		Arrays.sort(data);
		int tem_k =0;
		for(int i =data.length-1;i>=0;i--)
		{
			if(tem_k<k)
				ans = ans + data[i];
			else
				ans = ans - data[i];
			tem_k++;
		}
		System.out.println(ans);

	}

}
