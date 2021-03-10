package exception2;

public class Run {

public static void main(String[] args) {
		
		Application1 app = new Application1();
		
		try {
//			app.checkMoney(-1, 10000);		//	가격이 음수
//			app.checkMoney(10000, -1);		//	보유금액이 음수
//			app.checkMoney(50000, 10000);	//	보유금액 < 가격
			app.checkMoney(10000, 50000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
