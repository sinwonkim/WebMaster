package ch5;

public class ArrayCreateNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//베열을 만든다. int[] arr1; int[] arr = new int[3];
		int[] arr1 = new int[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr["+i+"] : "+arr1[i]);
		}
		// 각 배열 인덱스 마다 값 초기화
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("arr["+i+"]:"+arr1[i]);
		}
		double[] arr2 = new double[3];
		for(int i =0; i<3; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i<3; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i = 0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"]:"+arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월"; 
		for(int i = 0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"]:"+arr3[i]);
		}
	}

}
