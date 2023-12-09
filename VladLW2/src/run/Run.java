package run;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	   System.out.print("¬ведите число: ");
	   Integer number = scan.nextInt();
	   scan.close();
	   
	   int div = 2;
	   System.out.print(number + " = 1");
	   while (number > 1)
	   {
	     while (number % div == 0)
	     {
	    	 System.out.print(" * " + div);
	    	 number = number / div;
	     }
	     div++;
	   }
	}

}
