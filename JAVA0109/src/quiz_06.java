import java.util.Scanner;

public class quiz_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] arr;
		int rowNum;
		int colNum;
		char ch = 'a';
		
		System.out.print("행의 크기 : ");
		rowNum = scan.nextInt();
		arr = new char[rowNum][];
		for(int i = 0; i < rowNum; i++) {
			System.out.print(i + "열의 크기 : ");
			colNum = scan.nextInt();
			arr[i] = new char[colNum];
			for(int j = 0; j < colNum; j++) {
				arr[i][j] = (char) ch++;
			}
		}
		
		for(int i = 0; i < rowNum; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
