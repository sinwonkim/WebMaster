package ch5;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); // 동일한 String 객체를 참조 
		System.out.println(strArray[0].equals(strArray[2]));
		System.out.println(strArray[0] == strArray[2]);
	}

}
