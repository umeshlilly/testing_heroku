package github;

import java.util.Scanner;

public class Shift_The_String_1
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String data1 = s.nextLine();
		String data2 = s.nextLine();
		int mat[][] = new int[n + 1][n + 1];
		for (int i = 0; i < data2.length(); i++) {
			for (int j = 0; j < data1.length(); j++) {
				if (data2.charAt(i) == data1.charAt(j)) {
					mat[i + 1][j + 1] = mat[i][j] + 1;
				}

			}
		}
//		disp(mat);
		int ans = 0;
		int max = -1;
		for (int i = 0; i < data2.length(); i++) {
			int x = i + 1;
			int y = 1;
			int tem = 0;
			int inc = x;
			if (mat[i + 1][1] == 1) {
				while (true) {
					if (y >= data1.length())
						break;
//					System.out.println(x+" "+y);
					if (mat[x][y] != 0)
						tem++;
					else
						break;
					x++;
					if(x==data2.length()+1)
						x=1;
					y++;
					inc++;
				}
			}

			if (tem > max) {
				// System.out.println(tem);
				max = tem;
				ans = inc - tem - 1;

			}
		}
		// disp(mat);
		System.out.println(ans);

	}

	public static void disp(int data[][]) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

	}

}
