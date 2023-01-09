
public class MultidimenstionalArrayByNewExample {

	public static void main(String[] args) {
		//각 반의 학생수가 3명으로 동일한 경우
		int[][] mathScores = new int[2][3];
		
		for(int i = 0; i < mathScores.length; i++) {		//반의 수만큼 반복
			for(int k = 0; k < mathScores[i].length; k++) {	//해당반의 학생수 만큼 반복
				System.out.println("mathScores[" + i + "][" + k + "] : " + mathScores[i][k]);
			}
		}
		System.out.println();
		
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		int totalStudent = 0;
		int totalMathSum = 0;
		for(int i = 0; i < mathScores.length; i++) {		//반의 수만큼 반복
			totalStudent += mathScores[i].length;			//각 반의 학생수 누적
			for(int k = 0; k < mathScores[i].length; k++) {	//해당반의 학생수 만큼 반복
				totalMathSum += mathScores[i][k];			//학생 점수 합산
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 전체 점수 : " + totalMathSum);
		System.out.println("전체 학생의 수학 평균 점수 : " + totalMathAvg);
		System.out.println();
		
		//각 반의 학생 수가 다른 경우
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];		//첫 번째 반의 학생수 : 2
		englishScores[1] = new int[3];		//두 번째 반의 학생수 : 3
		
		for(int i = 0; i < englishScores.length; i++) {		//반의 수만큼 반복
			for(int k = 0; k < englishScores[i].length; k++) {	//해당반의 학생수 만큼 반복
				System.out.println("englishScores[" + i + "][" + k + "] : " + englishScores[i][k]);
			}
		}
		System.out.println();
		
		//배열 값 변경
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;

		//전체 학생의 영어 평균 구하기
		totalStudent = 0;
		int totalEnglishSum = 0;
		for(int i = 0; i < englishScores.length; i++) {		//반의 수만큼 반복
			totalStudent += englishScores[i].length;			//각 반의 학생수 누적
			for(int k = 0; k < englishScores[i].length; k++) {	//해당반의 학생수 만큼 반복
				totalEnglishSum += englishScores[i][k];			//학생 점수 합산
			}
		}
		double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
		System.out.println("전체 학생의 영어 전체 점수 : " + totalEnglishSum);
		System.out.println("전체 학생의 영어 평균 점수 : " + totalEnglishAvg);
	}

}
