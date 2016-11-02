package github;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Plane_Division
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = s.nextInt();
			Map<String, Integer> mapper = new HashMap<>();
			Map<String, Integer> used = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int a = s.nextInt();
				int b = s.nextInt();
				int c = s.nextInt();
				String key;
				String used_key;
				if (a == 0) {
					key = "0";
					used_key = "0";
				} else if (b == 0) {
					key = "pp";
					used_key = "pp";
				} else {
					int g = gcd(a, b);
					int aa = a / g;
					int bb = b / g;
					int cc = c / g;
					key = String.valueOf(aa) + "," + String.valueOf(bb);
					used_key = String.valueOf(aa) + "," + String.valueOf(bb) + "," + String.valueOf(cc);
				}
				if (used.get(used_key) == null) {
					if (mapper.get(key) == null)
						mapper.put(key, 1);
					else
						mapper.put(key, mapper.get(key) + 1);
				}
				used.put(used_key, 1);

			}
			// System.out.println(mapper);
			// System.out.println(used);
			int ans = -1;
			for (String key : mapper.keySet()) {
				if (mapper.get(key) > ans)
					ans = mapper.get(key);
			}
			System.out.println(ans);
		}

	}

	public static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return a + b; // base case
		return gcd(b, a % b);
	}

}
