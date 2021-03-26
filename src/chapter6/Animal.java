package chapter6;

public abstract class Animal {
	private String name;
	//배고픔 정도를 (0 매우 배고픔 ,10은 매우 배부름)
	private int hungry;
	
	
	public Animal() {
		this("animal");
	}	
	public Animal(String name) {
		this.name = name;
		
	}
	public String getMyName() {
		return name;
	}
	public abstract void run();
	public abstract void findFood();
	public abstract void eatFood();
	//동물들은 배고플 때 음식을 찾아서 먹으므로
	//eat 메서드를 사용해서 배고프다면if (hungry <=5) {
	//음식을 찾고 먹도록 구현하였다.
	//이때, 동물들 마다 음식을 찾는 방식이 다 다르므로 findFood메서드는 추상메서드로
	//동물들 마다 음식을 먹는 방식이 다 다르므로 eatFood메서드는 추상메서드로 선언하였음
	
	public void eat() {
		if (hungry <=5) {
			//음식을 찾는다.
			findFood();
			
			//음식을 먹는다.
			eatFood();
		}
	}
	
}
