package study_API.stringbuilder;

public class Application1 {
	
	public static void main(String[] args) {
		/*stringBuilder : 기존인스턴스 수정
		 * */
	
		StringBuilder sb = new StringBuilder("java");
		
		//toString() 오버라이딩 확인
		System.out.println(sb);
		System.out.println("sb  hashCod : " + sb.hashCode());
		
		sb.append("oracle");
		
		//변경 후 문자열 및 주소값 확인
		System.out.println(sb);
		System.out.println("sb hashCode : " + sb.hashCode());
	}
	
	
	
	
	
}
