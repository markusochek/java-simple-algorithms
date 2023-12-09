package run;

public class Run {

	public static void main(String[] args) {
		int N = 5;
		int array[][] = new int[N][N];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int)((Math.random() *89)+10);
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		
		int one = array[0][0];
		int two = array[0][1];
		for (int i = 0; i < array.length; i++) {
			
		}
		array[0][1] = one;
		one = array[0][2];
		
		array[0][2] = two;
		two = array[0][3];
		
		array[0][3] = one;
		one = array[0][4];
		
		array[0][4] = two;
		two = array[0][5];
		
		
//		
//		boolean flag = true;
//		for (int i = 0; i < array.length; i++) {
//			if (flag) {
//				int one = array[i][0];
//				int two = array[i][1];
//				for (int j = 1; j < array.length; j++) {
//				}
//				flag = false;
//			} else {
//				for (int j = array.length-1; j > 0; j--) {
//					array[i][j-1] = array[i][j];
//				}
//				flag = true;
//			}
//		}
//		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		
		
	}

}
