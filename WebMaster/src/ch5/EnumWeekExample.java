package ch5;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null; //���� Ÿ�� ���� ����
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);// ��(1) ~ ��(7)������ ���ڸ� ���� 
		
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
			
		System.out.println("������ ������ ?"+":"+today+"��"+"�ϴ�.");
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ����� ����.");
		}else {
			System.out.println("������ ��������.");
		}
		}
	}

}
