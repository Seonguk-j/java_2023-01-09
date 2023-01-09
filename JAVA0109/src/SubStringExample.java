
public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6);		//endindex : 앞에서 잘라진다.
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
