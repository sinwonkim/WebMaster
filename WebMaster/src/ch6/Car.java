package ch6;

public class Car {
	// Field
	String model;
	int speed; 
	
	// ������ Constructor
	Car(String model){
		this.model = model;
	}
	
	// �޼ҵ�Method
	void setSpped(int speed) {
		this.speed = speed;
	}
	
	// �޼ҵ� Method
	void run() {
		for(int i = 0; i<=600; i+=30) {
			this.setSpped(i);
			System.out.println(this.model+"�ü� :"+this.speed + "km/h");
			if(i==600) {
				System.out.println("��õ �Ͽ����ϴ�.");
			}
		}
	}
	void run2() {
		for(int i = 0; i<=150; i+=15) {
			this.setSpped(i);
			System.out.println(this.model+"�ü�:"+this.speed+"km/h");
			if(i==150) {
				System.out.println(this.model+"�� �Ѱ�ӵ��� �����ؼ� ���� �Ͽ����ϴ�.");
			}
		}
	}
}
