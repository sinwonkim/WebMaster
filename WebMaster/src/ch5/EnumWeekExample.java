package ch5;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null; //열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);// 일(1) ~ 토(7)까지의 숫자를 리턴 
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; 
			break;
		case 2:
			today = Week.MONDAY; 
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
		case 5:
			today = Week.THURSDAY;
			
		System.out.println("오늘의 요일은 ?"+":"+today+"입"+"니다.");
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일은 쉬자.");
		}else {
			System.out.println("열심히 공부하자.");
		}
		}
	}

}
