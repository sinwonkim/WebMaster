
public class Arrays {
	public static void main(String[] args) {
		// 배열 선언
		// 타입[] 변수;    타입 변수[];
		
	/*	String[] names = {"테스트1","테스트2","테스트3"};
		System.out.println(names[0]);*/
		
		int[] scores = {80,90,87};
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
	}
}
