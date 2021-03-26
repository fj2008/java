package chapter6;

public class Person extends Animal {
	public Person() {
		super("사람");
	}

	@Override
	public void run() {
		System.out.println(getMyName() + "이 졸라달린다");
	}

	@Override
	public void findFood() {
		System.out.println("배달 ㄱㄱ");
	}

	@Override
	public void eatFood() {
		System.out.println("개 존맛 ㅋㅋㅋ");
	}

}
