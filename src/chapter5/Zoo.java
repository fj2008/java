package chapter5;

public class Zoo {

	public static void main(String[] args) {
		//사육사 제임스 생성
		Zookeeper james = new ZooKeeper();
		
		Animal animal1 = new Lion();
		
		Animal animal2 = new Rabbit();
		
		Animal animal3 = new Monkey();
		
		//사자에게 먹이를 주기
		Lion lion = new Lion();
		james.feed(lion);
		
		//토끼에게 먹이를 주기
		Rabbit rabbi = new Rabbit();
		james.feed(rabbi);
		//원숭이에게 먹이를 주기
		
		Monkey monkey = new Monkey();
		james.feed(monkey);
	}

}
