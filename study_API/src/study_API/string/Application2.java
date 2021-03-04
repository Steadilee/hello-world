package study_API.string;

public class Application2 {
	
	public static void main(String[] args){
				
		String str1 = "이해승";
		String str2 = "이해승";
		String str3 = new String("이해승");
		String str4 = new String("이해승");
		
		System.out.println(str1 == str2);
		// 새로운 인스턴스 생성, ==비교시 false
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		
		// hashCode는 동일,오버라이딩 되어있음
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		System.out.println("str4 : " + str4.hashCode());
		
		// equals() 비교 결과	
		System.out.println("str1, str3 비교 : " + str1.equals(str3));
		System.out.println("str3, str4 비교 : " + str3.equals(str4));
		
		
		
	}
	
	
	
	
	
}
