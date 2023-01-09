
public class CharAtExample {

	public static void main(String[] args) {
		//주민등록번호의 값을 이용하여 성별 확인
		//생년월일성별 222(성별 7번째) 1 2 3 4
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);		//charAt 문자열에서 색인값으로 문자를 추출
		
		switch(sex) {
			case '1' :
			case '3' :
				System.out.println("남자입니다.");
			break;
			case '2' :
			case '4' :
				System.out.println("여자입니다.");
			break;
			default:
				System.out.println("입력값이 잘못되었습니다.");
		}
	}

}
