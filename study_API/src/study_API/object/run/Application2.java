package study_API.object.run;

import study_API.object.student.vo.StudentVO;

public class Application2 {

	public static void main(String[] args) {

		//	Objet.equals() 메소드 오버라이딩
		/*	Objet.equals 메소드는 전달받은 인스턴스와 ==연산하여 true or false를 반환!!
		 * 	동일객체 : 주소가 동일한 인스턴스
		 * 	동등객체 : 주소가 다르더라도 필드값이 동일한 객체
		 * 
		 * */
		
		StudentVO student1 = new StudentVO(1, "강백호", 188.0, "농구");
		StudentVO student2 = new StudentVO(1, "강백호", 188.0, "농구");
		
		System.out.println("==연산 결과 : " + (student1 == student2));		// == 비교시 주소값을 비교하기 때문에 false가 나온다
		
		// equals()메소드 오버라이딩
		System.out.println("equals 비교 : " + student1.equals(student2));
		
		
		
		
	}

	
}
