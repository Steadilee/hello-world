package generic.section2.extend;

//public class RabbitFarm<implements Animal>{
	
	//토끼 농장을 만들자
public class RabbitFarm<T extends Rabbit > {
	//TODO extends와 , 여러개 사용시 &와 마찬가지로 모두 일치해야하나?
	
	//어떤 토끼가 될 지 모른다. 토끼 종류는 다 받을 준비를 하자.
	
	private T animal;
	
	public RabbitFarm() {}
	
	public RabbitFarm(T animal) {
		this.animal = animal;
	}

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	
}
