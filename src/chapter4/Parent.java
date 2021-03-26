package chapter4;

public class Parent {
		public int x =10;
		
	//모든 클래스는 생성자가 반드시 필요하다.
	//생성자를 직접 추가해주지 않으면
	//컴파일러가 기본 생성자라고 하는 것을 추가해줌
	//기본생성자 > 매개변수가 없고 아무것도 하지(반환이없는) 않는 생성자
	//당연히 최상위 클래스인 object클래스도 기본생성자로 호출되있다.
	
	
	
	//상속 관계에서는 자식 클래스의 기본 생성자는
	//매개 변수는 없고 부모 클래스의 기본 생성자를 호출한다.
	
	public Parent(int x) {
		System.out.println("부모클래스의 생성자");
		this.x = x;
		
	}
	
	
//	public Child() {
//		super(); 부모클래스에 있는 다른 클래스를 호출한다
//	}
	
	
	
	//가정 1
	
	//기본 생성자를 직접 추가했고
	//부모 클래스의 기본 생성자를 호출하는 코드를
	//작성하지 않았다
	
	//가정1대로 하여도 자동으로 컴파일러가 자식클래스에 부모클래스를 호출한다.

	
	public static void main (System[] args) {
		
		
		
	}


	public void setNum(int num) {
		this.num = num;
	}
	
}
