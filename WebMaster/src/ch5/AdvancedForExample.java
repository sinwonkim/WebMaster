package ch5;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95, 71, 84, 93, 87}; // int[] scroes �迭 �ʱ�ȭ
		
		int sum = 0; // ���� ���� ����
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("���� ���� : " + sum +" �Դϴ�.");
		
		double avg = sum/scores.length;
		System.out.println("��"+"��"+":"+avg+"��"+"��"+"��.");
	}

}
