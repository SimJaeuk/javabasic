package Array;

public class AdvancedForExam {

	public static void main(String[] args) {
		int[] scores = { 95, 100, 89, 75, 90 };
		
		int sum = 0;
		for (int score: scores) {
			sum = sum + score;
		}
	
		System.out.println("점수 종합 = " + sum);
	
	}
	
		//향상된 for문 (파이썬 리스트랑 비슷한듯?)
}
