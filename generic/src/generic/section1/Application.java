package generic.section1;

public class Application {
	
	public static void main(String[] args) {
		
		/*	인스턴스 생성 */
		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		gt1.setValue(new Integer(10));
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);
		
		GenericTest<String> gt2 = new GenericTest<>();
		System.out.println(gt2.getValue());
		gt2.setValue("haeseung");
		System.out.println(gt2.getValue());
		
//		기본자료형은 받을 수 없다. <> 부분에는 참조변수! 
//		GenericTest<int> gt3 = new GenericTest<>();
		
		
	}
	
}
