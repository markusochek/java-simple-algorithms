package belgorodWork3;

import java.util.Scanner;

public class Run {
	
	public static int[] removeDuplicatesArray(int[] array) {
		int[] newArray = new int[array.length];
		int size = 0;
		
		for (int number : array) {
			boolean flag = true;
			for (int j = 0; j < size; j++) {
				if(number == newArray[j]) {
					flag = false;
					break;
				}
			}
			
			if (flag) {
				newArray[size] = number;
				size++;
			}
		}
		
		int[] newArray2 = new int[size];
		for(int i = 0; i < size; i++) {
			newArray2[i] = newArray[i];
		}
		return newArray2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите длину массива: ");
		int n = scan.nextInt();
		scan.close();
		
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * n/3);
		}
		
		System.out.print("исходный рандомный массив: ");
		for (int number : array) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		int[] newArray = removeDuplicatesArray(array);
		System.out.print("исходный массив без дупликатов: ");
		for (int number : newArray) {
			System.out.print(number + " ");
		}
	}

}
