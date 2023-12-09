package laboratoryWork;

import java.util.Scanner;

public class �ontrolWordMatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������� ����������� �����:");
		String controlWord = scan.nextLine();
		System.out.print("������� ����� ������ �����:");
		String text = scan.nextLine();
		scan.close();
		
		//String string1 = "marl";
		//String string2 = "makq";
		
		//Integer comparator = string1.compareTo(string2);
		//System.out.println(comparator);
		
	     String[] words = text.split("\\s");
		
	     int counter = 0;
		char[] controlWordArray = controlWord.toCharArray();
		int previousCounter = 10000;
		int ArrayOfCounters[] = new int[words.length];
		
		for (int u = 0; u < words.length; u++) {
			int length = 0;
			if (controlWord.length() < words[u].length()) {
				length = controlWord.length();
			}
			else {
				length = words[u].length();
			}
			counter = Math.abs(controlWord.length() - words[u].length());
			
			char[] wordArray = words[u].toCharArray();
			
			for (int i = 0; i < length; i++) {
				if (controlWordArray[i] != wordArray[i]) {
					counter++;
				}
			}
			ArrayOfCounters[u] = counter;
			if (counter < previousCounter) {
				previousCounter = counter;
			}
		}
		
		for (int u = 0; u < ArrayOfCounters.length; u++) {
			System.out.print(ArrayOfCounters[u] + " ");
		}
		
		System.out.println("");

		System.out.println("���������� ����������� ����� ������������ ����� � ������ ������� �� ������ �����: " + previousCounter);
		System.out.println("����� ���������� ������������ �� ���������(�) ������(���):");
		for (int u = 0; u < words.length; u++) {
			if (ArrayOfCounters[u] == previousCounter) {
				System.out.println(words[u]);
			}
		}
	}
}
