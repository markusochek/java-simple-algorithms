package run;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	   System.out.print("Введите число: ");
	   Integer n = scan.nextInt();
	   scan.close();
	   
	   int max = -1;
	   int min = 11;
	   while (n > 0) {
		   int remains = n % 10;
		   if (remains > max) {
			   max = remains;
		   }
		   if (remains < min) {
			   min = remains;
		   }
		   n = n / 10;
	   }
	   System.out.println("максимальное число = " + max);
	   System.out.println("минимальное число = " + min);
	}
}
