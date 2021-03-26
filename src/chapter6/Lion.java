package chapter6;

public class Lion extends Animal {
	public Lion() {
		super("사자");
	}

	@Override
	public void run() {
		System.out.println(getMyName() + "가 네발로 졸라달린다");
	}

	@Override
	public void findFood() {
		System.out.println("사냥하러 감 ㅅㄱ");
	}

	@Override
	public void eatFood() {
		System.out.println("홀리싯 사냥 성공 맞점");
	}
}
