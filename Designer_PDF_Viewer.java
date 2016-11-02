package github;

import java.util.Scanner;

public class Designer_PDF_Viewer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String tem = s.nextLine();
		int height [] = new int [26];
		String tem1[] = tem.split(" ");
		for(int i =0;i<tem1.length;i++)
		{
			height[i] = Integer.parseInt(tem1[i]);
		}
		String data = s.nextLine();
		int max =-1;
		for(int i =0;i<data.length();i++)
		{
			int now = (int)data.charAt(i) - 97;
			if(max<height[now])
				max = height[now];
						
		}
		System.out.println(max*data.length());
		
	}

}
