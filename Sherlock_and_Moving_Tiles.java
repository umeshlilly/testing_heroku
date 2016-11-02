package github;

import java.io.*;
import java.util.*;

public class Sherlock_and_Moving_Tiles
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int L = s.nextInt();
		int v1 = s.nextInt();

		int v2 = s.nextInt();

		int q = s.nextInt();
		for (int i = 0; i < q; i++) {
			int v_act = Math.abs(v1 - v2);
			long area = s.nextLong();
			double side = Math.sqrt(area);
			double diag = side * Math.sqrt(2);
			double diss = L * Math.sqrt(2) - diag;
			if (diss > 0) {
				double t = diss / (double) v_act;
				System.out.println((double) Math.round(t * 100000d) / 100000d);
				// System.out.printf("%.4f", t);
				System.out.println();
			} else {
				System.out.println("0");
			}
		}
	}

}
