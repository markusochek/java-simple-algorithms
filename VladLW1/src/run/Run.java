package run;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	   System.out.print("¬ведите пароль: ");
	   String password = scan.next();
	   scan.close();
       if (password.equals("vlad123")) {
    	   System.out.print("вы вошли в систему");
       } else {
    	   System.out.print("неверный пароль");
       }
	}
}
