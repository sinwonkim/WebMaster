
public class Car {
	
	// Car 클래스 필드 선언 
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	
	/*
	 * 자동차 객체를 예로 들어보면
	 * 필드는 객체의 고유 데이터, 객체가 가져야 할 부품, 객체의 현재 상태 데이터를 저장하는 곳이다. 
	 */
	
	/*// constructor 
	Car() {
		maxSpeed = 0;
	}
	
	// 메소드 
	void method() {
		maxSpeed = 10; // 값 변경
	}
	
	
	// 고유 데이터 
	String company; // 제작 회사 
	String model; // 모델
	String color; // 색깔
	int maxSpeed; // 최고 속도 
	
	// 상태 
	int speed; // 현재 속도 
	int rpm; // 엔진 회전 수 
	
	// 부품 
	Body body;
	Engine engine;
	Tire tire;*/
	
	// 타입은 필드에  저장할 데이터의 종류를 결정한다.
	// 타입에는 기본 타입( byte, short, int, long, float, double, boolean) 
	// 참조 타입이 모두 올 수 있다. 
	// 필드를 사용한다는 것은 필드값을 읽고 변경하는 작업을 말한다. 
	// 클래스 내부의 생성자나 메소드에서 사용할 경우 단순히 필드 이름으로 읽고 변경하면 되지만, 클래스 외부에서 사용할 경우 우선적으로 클래스로부터
	// 객체를 생성한 뒤  필드를 사용해야 한다. 그 이유는 필드는 객체에 소속된 데이터이므로 객체가 존재하지 않으면 필드도 존재하지 않는다. 
	
	
}
