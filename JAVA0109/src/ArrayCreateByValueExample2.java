
public class ArrayCreateByValueExample2 {

	public static void main(String[] args) {
		int[] scores;						//배열의 변수 선언 : 값은 없음 null
		scores= new int[] {83, 90, 97};		//new 이용해서 데이터 값 입력
		
		int sum1 = 0;
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		//배열을 매개값으로 주고, 메소드 호출 
		printItem(new int[] { 83,90, 97});
	}
	
	public static void printItem(int[] scores) {
		for(int i = 0; i < 3; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}
	}

}
