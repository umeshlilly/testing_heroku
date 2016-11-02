package github;

import java.util.ArrayList;
import java.util.Scanner;

public class Leonardo_s_Prime_Factors
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList<Long> primes = new ArrayList<>();

		primes.add((long) 2);
		primes.add((long) 3);
		long now = 5;
		long pro = 6;
		while (true) {
			int che = 0;
			for (int i = 0; i < primes.size(); i++) {
				if (now % primes.get(i) == 0) {
					che = 1;
					break;
				}
			}
			if (che == 0) {
				primes.add(now);
				pro = pro * now;
			}
			if (pro >= Math.pow(10, 18))
				break;
			now = now + 2;
		}

		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			long n = s.nextLong();
			long ans = 0;
			long tem = 1;
			for (int j = 0; j < primes.size(); j++) {
				tem = tem * primes.get(j);
				if (tem > n)
					break;
				else
					ans++;
			}
			System.out.println(ans);
		}

	}

}
