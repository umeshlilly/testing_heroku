package github;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Escalator
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long ans =0;
		int data[] = new int [n];
		Map<Integer, Integer> there = new HashMap<>();
		for(int i =0;i<n;i++)
		{
			data[i] = s.nextInt();
			there.put(data[i], 1);
		}
		for(int i =0;i<data[data.length-1]+20;i++)
		{
			for(int j =0;j<10;j++)
			{
				if(there.get(i-j)!=null)
				{
					ans++;
					break;
				}
			}
		}
			System.out.println(ans);
		
	}

}
