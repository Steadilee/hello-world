package study_API.wrapper;

public class Application2 {

	public static void main(String[] args) {
		
		/*	parsing : 문자열(String) 값을 기본자료형 값으로 변경하는 것을 parsing 이라고 한다.*/
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("4");				//	예외사항
		long l = Long.parseLong("8");				//	8L은 안된다.
		float f = Float.parseFloat("4.0");			//	4.0f
		double d = Double.parseDouble("8.0");
		boolean bl = Boolean.parseBoolean("true");
		
		char c = "abc".charAt(0);
		
		
	}
}
