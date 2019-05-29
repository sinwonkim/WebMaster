package ch6;

import java.util.Scanner;

public class CarExample {
	static String a;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 국적은 ?");
		a = scan.nextLine();
		if(a.equals("한국")) {
			Car myCar = new Car("모닝");
			myCar.run();
		}
		if(a.equals("일본")) {
			Car yourCar = new Car("캠리");
			yourCar.run2();
		}	
	}
}
