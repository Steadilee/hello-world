package exception2;

public class PriceNegativeException extends NegativeException{
	
	public PriceNegativeException() {}
	
	
	public PriceNegativeException(String message) {
		super(message);
	}
	
}
