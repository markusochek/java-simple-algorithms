package run;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("¬ведите r: ");
		Integer r = scan.nextInt();
		scan.close();
		
		System.out.format("%6s", "");
		for (int i = 0; i < r; i++) {
			System.out.format("%3s%3s", i, "   ");
		}
		System.out.println();
		
		for (int i = 0; i < r; i++) {
			System.out.format("%3s%3s", i, "   ");
			for (int j = 0; j < r ; j++) {
				int result = i * j;
				String remains = "";
				if (result >= r) {
					while(result > 0) {
						String remain = "" + result % r;
						if (result % r > 9) {
							remain = Integer.toHexString(result % r);
						}
						remains = remain + "" + remains;
						result = result / r;
					}
				} else {
					remains = "" + result;
				}
				System.out.format("%3s%3s", remains, "   ");
			}
			System.out.println();
		}
	}
}
