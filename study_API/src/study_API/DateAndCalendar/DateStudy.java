package study_API.DateAndCalendar;

import java.util.Date;

public class DateStudy {

	public static void main(String[] args) {
		
		// 기본생성자로 인스턴스 생성 (기본값 : 지금시간)
		Date date = new Date();	
		System.out.println(date);
		
		System.out.println(date.getTime());
		
		Date time = new Date(1614861292033L);
		System.out.println(time);
	}
	
}
