import java.util.Scanner;

public class quiz_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름, 학번과 학과를 입력하세요 : ");
		String str = scan.nextLine();
		String[] tokens = str.split("/");
		
		System.out.println("이름 : " + tokens[0]);
		System.out.println("학번 : " + tokens[1]);
		System.out.println("학과 : " + tokens[2]);
		
		String name;
		String born;
		System.out.print("이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.println("생년월일(mm/dd/yy)을 입력하세요 : ");
		born = scan.nextLine();
		String[] date = born.split("/");
		
		System.out.println("이름 : " + name);
		System.out.printf("%s년 %s월 %s일", date[2], date[0], date[1]);
		
		scan.close();
		
	}

}
