package chapter5;

public class Zoo {

	public static void main(String[] args) {
		//������ ���ӽ� ����
		Zookeeper james = new ZooKeeper();
		
		Animal animal1 = new Lion();
		
		Animal animal2 = new Rabbit();
		
		Animal animal3 = new Monkey();
		
		//���ڿ��� ���̸� �ֱ�
		Lion lion = new Lion();
		james.feed(lion);
		
		//�䳢���� ���̸� �ֱ�
		Rabbit rabbi = new Rabbit();
		james.feed(rabbi);
		//�����̿��� ���̸� �ֱ�
		
		Monkey monkey = new Monkey();
		james.feed(monkey);
	}

}
