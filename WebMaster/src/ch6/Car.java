package ch6;

public class Car {
	// Field
	String model;
	int speed; 
	
	// 생성자 Constructor
	Car(String model){
		this.model = model;
	}
	
	// 메소드Method
	void setSpped(int speed) {
		this.speed = speed;
	}
	
	// 메소드 Method
	void run() {
		for(int i = 0; i<=600; i+=30) {
			this.setSpped(i);
			System.out.println(this.model+"시속 :"+this.speed + "km/h");
			if(i==600) {
				System.out.println("승천 하였습니다.");
			}
		}
	}
	void run2() {
		for(int i = 0; i<=150; i+=15) {
			this.setSpped(i);
			System.out.println(this.model+"시속:"+this.speed+"km/h");
			if(i==150) {
				System.out.println(this.model+"가 한계속도에 도달해서 폭파 하였습니다.");
			}
		}
	}
}
