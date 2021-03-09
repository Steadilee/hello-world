package study_API.object.run;

import study_API.object.student.vo.StudentVO;

public class Application1 {
	
	public static void main(String[] args) {

		//.toString()을 사용해보자
		
		StudentVO student1 = new StudentVO(1, "김빨강", 170.0,"축구");
		StudentVO student2 = new StudentVO(2, "이초록", 165.2,"야구");
		StudentVO student3 = new StudentVO(2, "이초록", 165.2,"야구");		
		
		
		//1. .toString() : 풀클래스명 @ 16진수 해쉬코드를 반환.
		System.out.println("student1.toString() : " + student1.toString());

		//2. .toString()을 붙이지 않아도 자동호출된다.
		System.out.println("student2.toString() : " + student2);
		
		//3. 동일한 값을 가지는 인스턴스여도 다른 해쉬코드 값을 가지고 있다.
		System.out.println("student3.toString() : " + student3);
		
		//.toString활용
		//Object 클래스를 상속받아 오버라이딩 가능=> 오버라이딩 하여 원하는 String 값을 자동 리턴받을 수 있다. 
	}
}
