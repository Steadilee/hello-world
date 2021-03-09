package exception2;

public class Application1 {

	public void checkMoney(int price, int money) throws Exception// = priceNegativeException, MoneyNegativeException, NotEnoughMoneyException
	
	{ 
		
		if(price < 0) {
			
			throw new PriceNegativeException("가격이 음수일 수 없습니다.");
		}
		if(money < 0) {
			
			throw new MoneyNegativeException("보유금액이 음수일 수 없습니다.");
		}
		if(money < price) {
			
			throw new NotEnoughMoneyException("보유금액이 모자랍니다");
		}
		System.out.println("구매가능합니다.");
	}
}
