package generic.section2.run;

import generic.section2.extend.Bunny;
import generic.section2.extend.CuteBunny;
import generic.section2.extend.Rabbit;
import generic.section2.extend.RabbitFarm;
import generic.section2.extend.WildCardFarm;

public class WildCardApplication {
	
	public static void main(String[] args) {
		
		WildCardFarm wildCardFarm = new WildCardFarm();
		
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<CuteBunny>(new CuteBunny()));
		
		//자식의 자식도 가능하다
		wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.extendsType(new RabbitFarm<CuteBunny>(new CuteBunny()));
		
		//부모의 부모도 된다.(어차피 generic에서 Rabbit과 Rabbit을 상속받는 자식들로 제한을 했기에
		//아무리 올라가도 Rabbit에서 멈춘다.)
		wildCardFarm.superType(new RabbitFarm<CuteBunny>(new CuteBunny()));
		wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
		
	}
}
