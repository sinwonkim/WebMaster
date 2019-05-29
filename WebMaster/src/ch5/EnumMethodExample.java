package ch5;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			System.out.println(weekDay);
		}
	}

}
