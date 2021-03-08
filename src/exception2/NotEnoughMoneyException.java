package exception2;

public class NotEnoughMoneyException extends Exception{		//예외클래스, 보유금액<상품금액
	
	
	public NotEnoughMoneyException() {}
	
	
	public NotEnoughMoneyException(String message) {
		
		super(message);
	}
	
	

}
