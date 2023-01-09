
public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = {		//2차원 배열 scores [2]행[3]열 2*3 = 6 데이터를 입력가능
				{80,90,96},		//[0][0], [0][1], [0][2]
				{76,88},		//[1][0], [1][1]
		};
		
		System.out.println("1차원 배열 길이(변의 수) : " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) : " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수) : " + scores[1].length);
		
		//첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("scores[0][2] : " + scores[0][2]);
		//두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1] : " + scores[1][1]);
		
		//첫 번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for(int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];		//첫 번째 반의 각 학생의 값을 가져와 class1Sum에 누적
		}
		
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 전체 합계 : " + class1Sum);
		System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);
		
		//두 번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for(int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];		//두 번째 반의 각 학생의 값을 가져와 class2Sum에 누적
		}
		
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두 번째 반의 전체 합계 : " + class2Sum);
		System.out.println("두 번째 반의 평균 점수 : " + class2Avg);
		
		//전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
			}
			totalStudent += scores[i].length;
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("총 평균 점수 : " + totalAvg);
		
		
	}

}
