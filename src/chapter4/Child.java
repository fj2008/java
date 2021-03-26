package chapter4;

public class Child extends Parent {
	//부모 클래스로부터 상속 받은 정수를 저장하는 x
	//부모클래스에 매개변수가있다면 직접 매개변수에 맞게 호출을 해줘야함
	public int x;
	public int y;
	
	public Child () {
		this(0,0);
		System.out.println("매개변수가 없는 생성자");
	}
	
	
	public Child (int x, int y) {
		
		System.out.println("매개변수 있는 생성자");
		this.x = x;
		this.y = y;
	}
	
	//자식 클래스의 인스턴스가 만들어 질때
	//부모 클래스의 멤버들을 같이 생성하므로
	
	//자식 클래스의 생성자를 만든다면
	//자식 클래스의 생성자의 맨 처음에 부모 클래스의 생성자를 호출해야한다.
	//내가 부모클래스 호출을 하지 않더라도컴파일러가 자동으로 부모클래스를 호출해버림
	//위사항은 규칙임 바꿀수 없쪙
	public Child (int x,int y) {
		
		System.out.println("자식 클래스의 생성자");
		this.x = x;
		this.y = y;
		
	}
	
	
	
	public void method() {
		System.out.println("x = " + x);
		//자식클래스에 변수부터 먼저 수행한다. 없을시에 상속받은 멤버변수 실행
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method();
		child.x();
		child.y();
	}
	
	
}
