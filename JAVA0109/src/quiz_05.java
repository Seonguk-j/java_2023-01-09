
public class quiz_05 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int)(Math.random() * 10) + 1;
				arr[i][arr[i].length - 1] += arr[i][j];
				arr[arr.length - 1][j] += arr[i][j];
				arr[arr.length - 1][arr[i].length - 1] += arr[i][j];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
