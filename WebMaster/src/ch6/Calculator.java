package ch6;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // plus() call
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); // avg()call
		println("실행 결과" + result); // println() call 
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
}
