
public class ReferenceType {
	public static void main(String[] args) {
		String strVar1 = "���׽�Ʈ";
		String strVar2 = "���׽�Ʈ";
		
		if(strVar1 == strVar2) {
			System.out.println("������ ����");
		}else {
			System.out.println("������ �ٸ�");
		}
		
		String strVar3 = new String("���׽�Ʈ");
		String strVar4 = new String("���׽�Ʈ");
		
		if(strVar3 == strVar4) {
			System.out.println("������ ����");
		}else {
			System.out.println("������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("���ڿ��� ����");
		}else {
			System.out.println("���ڿ��� �ٸ�");
		}
	}
}
