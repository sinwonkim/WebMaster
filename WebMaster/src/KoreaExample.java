
public class KoreaExample {
	public static void main(String[] args) {
		// korea Ŭ������ ��ü K1 ����  ������ ȣ�� ���� ���� 
		Korea k1 = new Korea("���ڹ�", "011225-1234567");
		System.out.println("k1 name: "+k1.name);
		System.out.println("k1 ssn: "+k1.ssn);
		
		// ������ �����ε��� ���ؼ� �̷��� �� ������ ���� �ʴ´�.
		Korea k2 = new Korea("Korea",820243342);
		System.out.println("myNation is  : "+ k2.nation);
		System.out.println("myPhoneNumber is :"+ k2.phoneNumber);
	}
}
