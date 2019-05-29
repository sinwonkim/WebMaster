package ch5;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=2) { // 입력된 데이터 개수가 두 개가 아닐 경우
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // 프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1 +"+" + num2 +" = " + result);
	}

}
