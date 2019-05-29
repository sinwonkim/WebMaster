package ch5;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95, 71, 84, 93, 87}; // int[] scroes 배열 초기화
		
		int sum = 0; // 총합 넣을 변수
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("점수 총합 : " + sum +" 입니다.");
		
		double avg = sum/scores.length;
		System.out.println("평"+"균"+":"+avg+"입"+"니"+"다.");
	}

}
