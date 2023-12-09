package run;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   System.out.print("������� a: ");
		   Integer a = scan.nextInt();
		   System.out.print("������� b: ");
		   Integer b = scan.nextInt();
		   System.out.print("������� alpha: ");
		   Integer alpha = scan.nextInt();
		   scan.close();
		   
		   double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(alpha)));
		   System.out.println("3 ������� = " + c);
		   
		   double beta =  Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
		   System.out.println("������ ���� = " + beta);
		   
		   double gamma = 180 - alpha - beta;
		   System.out.println("������ ���� = " + gamma);
	}

}
