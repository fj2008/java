package chapter6;

public class Person extends Animal {
	public Person() {
		super("���");
	}

	@Override
	public void run() {
		System.out.println(getMyName() + "�� ����޸���");
	}

	@Override
	public void findFood() {
		System.out.println("��� ����");
	}

	@Override
	public void eatFood() {
		System.out.println("�� ���� ������");
	}

}
