package generic.section2.extend;

public class WildCardFarm {
	/* 와일드카드를 이용해 매개변수 제한을 해보자*/
	
	public void anyType(RabbitFarm<?> farm) {
		farm.getAnimal().cry();
	}
	
	/**
	 * <pre>
	 * 	자식의 자식인 CuteBunny도 되는지 확인해보자
	 * </pre>
	 * @param farm
	 */
	public void extendsType(RabbitFarm<? extends Rabbit> farm) {
		farm.getAnimal().cry();
	}
	
	/**
	 * <pre>
	 *	부모의 부모인 Rabbit도 되는지 확인해보자
	 * </pre>
	 * @param farm
	 */
	public void superType(RabbitFarm<? super CuteBunny> farm) {
		farm.getAnimal().cry();
	}
	
}
