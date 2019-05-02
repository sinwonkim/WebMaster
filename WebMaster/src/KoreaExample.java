
public class KoreaExample {
	public static void main(String[] args) {
		// korea 클래스의 객체 K1 생성  생성자 호출 인자 전달 
		Korea k1 = new Korea("박자바", "011225-1234567");
		System.out.println("k1 name: "+k1.name);
		System.out.println("k1 ssn: "+k1.ssn);
		
		// 생성자 오버로딩을 통해서 이러한 건 문제가 되지 않는다.
		Korea k2 = new Korea("Korea",820243342);
		System.out.println("myNation is  : "+ k2.nation);
		System.out.println("myPhoneNumber is :"+ k2.phoneNumber);
	}
}
