
public class quiz_04 {

	public static void main(String[] args) {
		String[][] arr1 = new String[3][3];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr2 = new int[4][4];
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print((4 * i + j + 1) + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr3 = new int[4][4];
		for(int i = arr3.length; i > 0 ; i--) {
			for(int j = arr3[i - 1].length; j > 0 ; j--) {
				System.out.print((4 * i + j) + " ");
			}
			System.out.println();
		}
		
	}

}
