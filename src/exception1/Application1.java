package exception1;

public class Application1 {

	public static void main(String[] args) {
		
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkMoney(50000, 10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("안녕히 가세요");
	}
}
