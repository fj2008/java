package chapter6;

public class Lion extends Animal {
	public Lion() {
		super("����");
	}

	@Override
	public void run() {
		System.out.println(getMyName() + "�� �׹߷� ����޸���");
	}

	@Override
	public void findFood() {
		System.out.println("����Ϸ� �� ����");
	}

	@Override
	public void eatFood() {
		System.out.println("Ȧ���� ��� ���� ����");
	}
}
