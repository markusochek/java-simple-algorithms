package laboratoryWork;

public class LatinSquare {

	public static void main(String[] args) {
		//Integer N = 3;
		int N = 3;
		int array[][] = new int[N][N];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int)((Math.random() *N)+1);
			}
		}
		
		// проверка на 3 x 3;
//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[0][2] = 3;
//		
//		array[1][0] = 3;
//		array[1][1] = 1;
//		array[1][2] = 2;
//		
//		array[2][0] = 2;
//		array[2][1] = 3;
//		array[2][2] = 1;
		
		// проверка на 2 x 2;
//		array[0][0] = 1;
//		array[0][1] = 2;
//		
//		array[1][0] = 2;
//		array[1][1] = 1;
		
		System.out.println("матрица N x N:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			if (!flag) {
				break;
			}
			for (int j = 0; j < array.length; j++) {
				int k = j+1;
				while (k != array.length) {
					if(array[i][j] == array[i][k]) {
						flag = false;
						break;
					}
					if(array[j][i] == array[k][i]) {
						flag = false;
						break;
					}
					k++;
				}
			}
		}
		
		if (flag) {
			System.out.println("матрица N x N является латинским квадратом");
		}
		else {
			System.out.println("матрица N x N не является латинским квадратом");
		}
	}
}
