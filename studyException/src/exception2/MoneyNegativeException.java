package exception2;

public class MoneyNegativeException extends NegativeException {		// 보유금액이 음수

	
	public MoneyNegativeException() {}
	
	
	public MoneyNegativeException(String message) {
		super(message);
	}
}
