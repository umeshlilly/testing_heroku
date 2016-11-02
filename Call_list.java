package github;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Call_list
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String tem = s.nextLine();
		String tem1 [] = tem.split(" ");
		int n = Integer.parseInt(tem1[0]);
		int m = Integer.parseInt(tem1[1]);
		
		String data [] = new String[n];
		for(int i =0;i<n;i++)
		{
			data[i] = s.nextLine();
		}
		
		Arrays.sort(data);
		System.out.println(data[m-1]);
		
	}

}
