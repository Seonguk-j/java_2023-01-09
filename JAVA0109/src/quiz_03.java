import java.util.Scanner;

/*
 * '가을'을 포함한 한줄의 문장을 입력받아 '가을'을 '봄'으로 바꾸어 출력
 */
public class quiz_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력하세요 : ");
		String input = scan.nextLine();
		String output = input.replace("가을", "봄");
		System.out.println(output);
		
		System.out.print("과일을 입력하세요 : ");
		String str = scan.nextLine();
		String[] fruits = str.split(" ");
		for(int i = fruits.length - 1; i >= 0; i--) {
			System.out.print(fruits[i] + " ");
		}
		
		scan.close();
	}

}
