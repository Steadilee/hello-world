package study_API.DateAndCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar_study {

	public static void main(String[] args) {
		 
		Calendar calendar = Calendar.getInstance();	// subClass인 GregorianCalendar의 생성자를 호출한다
		System.out.println(calendar);
		
		Calendar calendar2 = new GregorianCalendar();	// subClass인 GregorianCalendar를 이용하여 생성자 호출
		System.out.println(calendar2);
		
		/* 특정 날짜/시간 정보를 이용하여 인스턴스 생성 */
		//년, 월, 일, 시, 분, 초 정보 이용
		//1993년 01월 29일 14:01:00
		int year = 1993;
		int month = 0;	//월은 0~11월
		int dayOfMonth = 29;
		int hour = 14;
		int min = 1;
		int second = 0;
		
		Calendar calendar3 = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
		System.out.println(calendar3);
		
		System.out.println(calendar3.getTimeInMillis());		
		
		Date date = new Date(calendar3.getTimeInMillis());
		System.out.println(date);
		
		//get()메소드를 사용하여 생성한 필드 반환
		int birthYear = calendar3.get(1);
		int birthMonth = calendar3.get(2);
		int birthDayOfMonth = calendar3.get(5);
		System.out.println(birthYear);
		System.out.println(birthMonth);
		System.out.println(birthDayOfMonth);
		
		//위와 동일한 결과가 나온다.
		System.out.println(Calendar.YEAR);		//1
		System.out.println(Calendar.MONTH);		//2
		System.out.println(Calendar.DATE);		//5
		
		System.out.println(calendar3.get(Calendar.YEAR));
		System.out.println(calendar3.get(Calendar.MONTH));
		System.out.println(calendar3.get(Calendar.DATE));
		
		//0은 오전 1은 오후
		System.out.println("amPm : " + calendar3.get(Calendar.AM_PM));		//14시는 오후!
		System.out.println("24시간 : " + calendar3.get(Calendar.HOUR_OF_DAY));
		System.out.println("12시간 : " + calendar3.get(Calendar.HOUR));
		System.out.println("min : " + calendar3.get(Calendar.MINUTE));
		System.out.println("second : " + calendar3.get(Calendar.SECOND));
				
		
		
		
		
	}
	
}
