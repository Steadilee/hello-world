package study_API.wrapper;

public class Application1 {
	
	public static void main(String[] args) {
		
		int intValue = 20;
		//Boxing
		Integer boxingNumber1 = new Integer(intValue);
		Integer boxingNumber2 = Integer.valueOf(intValue);
		
		//UnBoxing
		int unBoxingNumber1 = boxingNumber1.intValue();
		
		double doubleValue = 10.0;
		Double boxingNumber3 = doubleValue;
		double unBoxingNumber2 = boxingNumber3;
		
		int inum = 20;
		Integer integerNum1 = new Integer(20);
		Integer integerNum2 = new Integer(20);
		Integer integerNum3 = 20;
		Integer integerNum4 = 20;
		
		System.out.println(inum == integerNum1);
		System.out.println(integerNum1 == integerNum2);
		System.out.println(integerNum2 == integerNum3);
		System.out.println(integerNum3 == integerNum4);
	}
}
