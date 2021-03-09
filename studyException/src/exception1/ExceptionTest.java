package exception1;

public class ExceptionTest {
	
	public void checkMoney(int price, int money) throws Exception {
		
		
		System.out.println("보유금액 : " + money);
		
		if(price <= money) {				// 	물건값과 보유금액비교
			System.out.println("구매가능");
		} else {							//	예외발생
			
			throw new Exception("구매불가");
		}
		System.out.println("행복하세요~");
	}
}
