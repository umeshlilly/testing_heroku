package github;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repetition_Free_Numbers
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
//		if (Integer.parseInt(data) >= 987654321)
			if(1==2)
			System.out.println("0");
		else {
			int now = Integer.parseInt(data);
			for (int i = now; i < 987654321; i++) {
				if (isValid(i)) {
					System.out.println(i);
					break;
				}
			}

		}

	}

	public static boolean isValid(int data) {

		String data1 = String.valueOf(data);
		if (data1.contains("0"))
			return false;
		Map<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < data1.length(); i++) {
			freq.put(data1.charAt(i), 1);
		}
		if (freq.size() == data1.length())
			return true;
		else
			return false;
	}

}
