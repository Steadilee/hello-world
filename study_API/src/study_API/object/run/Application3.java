package study_API.object.run;

import java.util.HashMap;
import java.util.Map;

import study_API.object.student.vo.StudentVO;

public class Application3 {

	public static void main(String[] args) {

		//	Object 클래스의 명세에 따르면 equals메소드를 재정의 하는경우 반드시 hashCode()메소드도 재정의 해야한다.
		//	재정의 하지 않으면 값은 값을 가지는 동등객체는 같은 hashCode값을 가져야 한다는 규약에 위반된다.
		
		StudentVO student1 = new StudentVO(11, "서태웅", 187.5, "농구");
		StudentVO student2 = new StudentVO(11, "서태웅", 187.5, "농구");
		
		//두 인스턴스의 동등성 비교
		System.out.println(student1.equals(student2));

		//두 인스턴스의 hash 코드 확인(동등하지만 hashCode가 다름을 알 수 있음  
		System.out.println("student 1의 hashcode : " + student1.hashCode());
		System.out.println("student 2의 hashcode : " + student2.hashCode());
		
		//	오버라이딩 이후 출력하면 동일한 hashCode값이 나온다.
		
		//	재정의한 equals 비교 결과가 true지만 hashCode가  다른 경우 발생할 수 있는 문제..
		Map<StudentVO, String> map = new HashMap<>();
		map.put(new StudentVO(11, "서태웅", 187.5, "농구"), "북산에이스");
		
		String str = map.get(new StudentVO(11, "서태웅", 187.5, "농구"));
		System.out.println(str);	//출력결과는?   오버라이딩 되어있지 않으면 null값이 나온다..원하는 값이 아니다..
		
		
		
		
	}
}
