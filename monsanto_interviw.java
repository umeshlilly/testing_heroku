package github;

import java.util.Arrays;
import java.util.Scanner;

public class monsanto_interviw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int[n];
		for(int i =0;i<n;i++)
		{
			data[i] = s.nextInt();
		}
		min_sub_array(data);
//		System.out.println(min_sub_array(data)[0] +" "+ min_sub_array(data)[1]);

	}

	public static int[] min_sub_array(int input[]) {
		int[] sorted_input = new int [input.length];
		for (int i = 0; i < input.length; i++) 
		{
			sorted_input[i] = input[i];
		}
	
		Arrays.sort(sorted_input); //// sorting the temporary array
		int m = 0;
		int n = 0;
		for (int i = 0; i < input.length; i++) /// looping to find first element
												/// which is not in order.
		{
			if (sorted_input[i] != input[i]) {
				m = i;
				break;
			}
		}
		for (int i = input.length - 1; i >= 0; i--) /// Looping to find the last
													/// elemrnt which is not in
													/// sorted order
		{
			if (sorted_input[i] != input[i]) {
				n = i;
				break;
			}
		}

		int ans[] = new int[2];
		ans[0] = m;
		ans[1] = n;
		return ans;
	}
	public static void disp(int data[])
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
