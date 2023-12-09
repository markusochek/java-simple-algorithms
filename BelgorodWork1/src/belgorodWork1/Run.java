package belgorodWork1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Run {
	
	public static void println(Map.Entry<String,Long> element) {
		System.out.println("\"" + element.getKey() + "\"" + " ���������� ����������: " + element.getValue());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       System.out.print("������� ������: ");
       String scannerLine = scan.nextLine();
       scan.close();
       
       // ��������� ������ �� ��������� �������
       Arrays.asList(scannerLine.split("")).stream()
       
       // ����������� ��� �������� ��������
       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
       
       // ���������� ��������, ������� ����������� ������ 1 ���� � �� ����� �� �����
       .filter(element -> element.getValue() > 1)
       .forEach(Run::println);
	}
}
