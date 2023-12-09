package belgorodWork21;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Run {
	
	public static void println(char symbol) {
		System.out.println("ѕервый неповтор€емый символ в строке: " + symbol);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       System.out.print("¬ведите строку: ");
	       String scannerLine = scan.nextLine();
	       scan.close();
	       
	       int codeOfNullSymbol = "а".chars().findFirst().getAsInt();
	       
	       ArrayList<Integer> symbols = new ArrayList<>(33);
	       IntStream.range(0, 33)
	       .forEach(i -> symbols.add(i, 0));
	       
	       scannerLine.chars()
	       .map(symbol -> symbol - codeOfNullSymbol)
	       .filter(symbol -> symbol >= 0)
	       .forEach(symbol -> symbols.set(symbol, symbols.get(symbol) + 1));
	       
	       int firstNonRepeatableCharInString = scannerLine.chars()
	       .map(symbol -> symbol - codeOfNullSymbol)
	       .filter(symbol -> symbol >= 0)
	       .filter(symbol -> symbols.get(symbol).equals(1))
	       .findFirst().getAsInt();
	       
	       Run.println((char)(firstNonRepeatableCharInString + codeOfNullSymbol));
	}

}