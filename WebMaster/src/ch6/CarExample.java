package ch6;

import java.util.Scanner;

public class CarExample {
	static String a;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ������ ?");
		a = scan.nextLine();
		if(a.equals("�ѱ�")) {
			Car myCar = new Car("���");
			myCar.run();
		}
		if(a.equals("�Ϻ�")) {
			Car yourCar = new Car("ķ��");
			yourCar.run2();
		}	
	}
}
