package run;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	   System.out.print("������� ������: ");
	   String password = scan.next();
	   scan.close();
       if (password.equals("vlad123")) {
    	   System.out.print("�� ����� � �������");
       } else {
    	   System.out.print("�������� ������");
       }
	}
}
