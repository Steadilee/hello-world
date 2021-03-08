package exception2;

public class priceNegativeException extends NegativeException{	//상품금액 음수인 경우
	

	public priceNegativeException() {}
	
	
	public priceNegativeException(String message) {
		super(message);
	}

}
