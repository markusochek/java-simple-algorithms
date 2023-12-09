package run;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   System.out.print("¬ведите a: ");
		   Integer a = scan.nextInt();
		   System.out.print("¬ведите b: ");
		   Integer b = scan.nextInt();
		   System.out.print("¬ведите alpha: ");
		   Integer alpha = scan.nextInt();
		   scan.close();
		   
		   double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(alpha)));
		   System.out.println("3 сторона = " + c);
		   
		   double beta =  Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
		   System.out.println("второй угол = " + beta);
		   
		   double gamma = 180 - alpha - beta;
		   System.out.println("третий угол = " + gamma);
	}

}
