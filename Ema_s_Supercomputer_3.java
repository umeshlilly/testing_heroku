/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package github;

import java.util.Scanner;

/**

 */
public class Ema_s_Supercomputer_3
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String now = s.nextLine();
		String now1[] = now.split(" ");
		int n = Integer.parseInt(now1[0]);
		int m = Integer.parseInt(now1[1]);
		char data[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			now = s.nextLine();
			for (int j = 0; j < m; j++) {
				data[i][j] = now.charAt(j);
			}
		}

		int[][] ans = ranks(data);
		int max1 = -1;
		int max2 = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (max1 < ans[i][j]) {
					max2 = max1;
					max1 = ans[i][j];
				} else if (max2 < ans[i][j]) {
					max2 = ans[i][j];
				}
			}
		}
		int check = 0;
		int final_ans = 0;
		for (int i = max1; i >= 0; i--) {
			for (int j = max2; j >= 0; j--) {
				if(isValid(ans,i,j))
				{
					
				}
			
			}
		}

	}
	public static boolean isValid(int [][]data,int x,int y)
	{
//		for(int i )
		
		
		
		return false;
	}
	
	public static int[][] ranks(char[][] data) {
		int n = data.length;
		int m = data[0].length;
		int ans[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (data[i][j] == 'G') {
					int x = i;
					int y = j;
					int rank_now = 1;
					if (x + 1 < n && x - 1 >= 0 && y + 1 < m && y - 1 >= 0) {
						if (data[x + 1][y] == 'G' && data[x - 1][y] == 'G' && data[x][y + 1] == 'G'
								&& data[x][y - 1] == 'G') {
							rank_now++;
						}
					}
					ans[i][j] = rank_now;
				}

			}
		}
		disp(ans);
		return ans;
	}

	public static void disp(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

}