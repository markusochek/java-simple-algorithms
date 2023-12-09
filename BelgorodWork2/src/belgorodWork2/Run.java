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
		System.out.println("������ ������������� ������ � ������: " + symbol);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       System.out.print("������� ������: ");
	       String scannerLine = scan.nextLine();
	       scan.close();
	       
	       List<String> line = Arrays.asList(scannerLine.split(""));
	       
	     //����� �������� ������������� 1 ���
		   List<String> charactersThatOccurOnce = line.stream()
	       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
	       .filter(element -> element.getValue() == 1)
	       .map(element->element.getKey())
	       .collect(Collectors.toList());
	       
		   //��������� �������� � ������ � �������� � charactersThatOccurOnce �� ��� ���, ���� �� �������� ������ ���������� ������ � charactersThatOccurOnce
	       String symbol = line.stream()
			   .filter(elementLine -> charactersThatOccurOnce.stream().anyMatch(elementList -> elementList == elementLine))
			   .findFirst().get();
	       
	       Run.println(symbol);
	}

}