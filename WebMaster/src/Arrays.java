
public class Arrays {
	public static void main(String[] args) {
		// �迭 ����
		// Ÿ��[] ����;    Ÿ�� ����[];
		
	/*	String[] names = {"�׽�Ʈ1","�׽�Ʈ2","�׽�Ʈ3"};
		System.out.println(names[0]);*/
		
		int[] scores = {80,90,87};
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
	}
}
