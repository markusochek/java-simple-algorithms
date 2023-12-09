package laboratoryWork;

//import java.util.Scanner;

public class UniversitySchedule {

	public static void main(String[] args) {
//		 Scanner scan = new Scanner(System.in);
//         System.out.print("¬ведите количество пар:");
//         Integer n = scan.nextInt();
//         System.out.print("¬ведите длительность пары:");
//         Integer a = scan.nextInt();
//         System.out.print("¬ведите длительность перемены:");
//         Integer b = scan.nextInt();
//         scan.close();
		
		Integer n = 5;
		Integer a = 90;
		Integer b = 10;
		
		Integer hours1 = 8;
		Integer minutes1 = 0;
		Integer hours2 = 8;
		Integer minutes2 = 0;
		
		System.out.format("%1s%7s%10s", "є", "ѕара", "ѕерерыв");
		System.out.println();
		for (int i = 0; i < n; i++) {
			String renderNullHours1 = "";
			String renderNullMinutes1 = "";
			String renderNullHours2 = "";
			String renderNullMinutes2 = "";
			
			hours2 = hours1 + a / 60;
			minutes2 = minutes1 + a % 60;
			if (minutes2 >= 60) {
				hours2 += minutes2 / 60;
				minutes2 -= 60*(minutes2 / 60);
			}
			
			if (hours1 < 10) {
				renderNullHours1 = "0";
			}
			if (minutes1 == 0) {
				renderNullMinutes1 = "0";
			}
			
			if (hours2 < 10) {
				renderNullHours2 = "0";
			}
			if (minutes2 == 0) {
				renderNullMinutes2 = "0";
			}
			
			System.out.format("%1s%7s%10s",
				(i+1),
				renderNullHours1 + hours1 + ":" + minutes1 + renderNullMinutes1,
				renderNullHours2 + hours2 + ":" + minutes2 + renderNullMinutes2);
			System.out.println();
			
			minutes2 += b;
			if (minutes2 >= 60) {
				hours1 = hours2 + minutes2 / 60;
				minutes1 = minutes2 - 60*(minutes2 / 60);
			} else {
				hours1 = hours2;
				minutes1 = minutes2;
			}
		}
	}

}
