package belgorodWork2;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run {
	
	public static void println(String symbol) {
		System.out.println("Первый неповторяемый символ в строке: " + symbol);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       System.out.print("Введите строку: ");
	       String scannerLine = scan.nextLine();
	       scan.close();
	       
	       List<String> line = Arrays.asList(scannerLine.split(""));
	       
	     //поиск символов встречающихся 1 раз
		   List<String> charactersThatOccurOnce = line.stream()
	       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
	       .filter(element -> element.getValue() == 1)
	       .map(element->element.getKey())
	       .collect(Collectors.toList());
	       
		   //сравнение символов в строке и символов в charactersThatOccurOnce до тех пор, пока не найдется первый попавщийся символ в charactersThatOccurOnce
	       String symbol = line.stream()
			   .filter(elementLine -> charactersThatOccurOnce.stream().anyMatch(elementList -> elementList == elementLine))
			   .findFirst().get();
	       
	       Run.println(symbol);
	}

}