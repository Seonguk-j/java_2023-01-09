
public class lengthExample {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		int length = ssn.length();		//length 문자의 개수를 반환
		
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}
		else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
	}

}
