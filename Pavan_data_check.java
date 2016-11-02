package github;

import java.util.Scanner;

public class Pavan_data_check
{

	public static void main(String[] args) {
		
		Scanner s = new Scanner("C:\\Users\\uravuru\\Desktop\\pavan\\input.txt");
		String data = s.nextLine();
		while(s.hasNext())
		{
			System.out.println(data);
			data = s.nextLine();
		}
		s.close();
		
	}

}
