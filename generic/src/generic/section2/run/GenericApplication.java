package generic.section2.run;

import generic.section2.extend.Bunny;
import generic.section2.extend.CuteBunny;
import generic.section2.extend.Rabbit;
import generic.section2.extend.RabbitFarm;

public class GenericApplication {
	public static void main(String[] args) {
		
		//generic 클래스 인스턴스를 생성해보자(현재 extends Rabbit 으로 제한중)
		
		//Rabbit이거나 Rabbit과 상속 관계가 아니면 typemismatch로 인스턴스 생성불가
//		RabbitFarm<Animal> farm1 = new RabbitFarm<Rabbit>();
//		RabbitFarm<Mammal> farm2 = new RabbitFarm<Rabbit>();
//		RabbitFarm<Reptile> farm3 = new RabbitFarm<Rabbit>();
//		RabbitFarm<Snake> farm4 = new RabbitFarm<Rabbit>();
		
		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>(); 
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>(); 
		RabbitFarm<CuteBunny> farm3 = new RabbitFarm<>();
		
		
		// setter에도 올바른 타입의 인스터스를 인자로 전달하자.
		farm1.setAnimal(new Rabbit());
		farm1.getAnimal().cry();
		
		farm1.setAnimal(new Bunny());
		farm1.getAnimal().cry();		//	되는구나
		
		
		
		
		
		
		
	}

	
}
