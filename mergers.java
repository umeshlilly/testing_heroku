package github;

import java.util.Scanner;

public class mergers
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		String buff = s.nextLine();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = i ;
		}

		for (int i = 0; i < m; i++) {
			String tem = s.nextLine();
			String tem1[] = tem.split(" ");
			if (tem1[0].equals("F")) {
				int x = Integer.parseInt(tem1[1]);
				int y = Integer.parseInt(tem1[2]);

				int now = data[x-1];
				for (int j = 0; j < data.length; j++) {
					if (data[j] == now)
						data[j] = data[y-1];
				}
				
			} else {
				int x = Integer.parseInt(tem1[1]);
				int y = Integer.parseInt(tem1[2]);
				if(data[x-1]==data[y-1])
					System.out.println("S");
				else
					System.out.println("N");
			}

		}
//		System.out.println(data);

	}

}
