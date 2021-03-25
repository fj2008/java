package chapter3;

public class Car {
	private int color;
	private int wheel;
	private float speed;
	private double fuel;
	
	public void setColor(int color) {
		this.color = color;
	}
	//생성자는 인스턴스가 만들어질 때마다 자동으로 호출되는 메서드,
	//일반적인 메서드가 아니므로 이름이 정해져 있음
	//생성자 메서드의 이름은 클래스의 이름과 같아야한다.
	//생성자 메서드는 반환타입이 없다.
	//생성자의 접근 제어자는 public,private 중 하나를 쓸 수 있다.
	//클래스안에 인스턴스를 만들때마다 생성자가 호출됨
	//생성자도 메서드이기때문에 오버로딩이 가능하다
	
	public Car() {
		
		this(3,5,0.1f,3.0);
		//자동차의 색을 첫번째 색으로 지정
		color =1;
		//바퀴의 개수를 4개로지정
		wheel =4;
		//속력은 0
		speed = 0;
		//연료랑은 0
		fuel = 0;
		
		System.out.println("Car 클래스의 생성자 호출");
	}
	
	public Car(int color, int wheel, float speed, double fuel) {
		//생성자 안에서 다른생성자를 호출하는 방법
		//this(매개변수) 는 생성자를 호출하는 방법
		//this()를 사용하면 생성자를 호출할 수 있는데
		//생성자만이 생성자를 호출할 수 있다.
		// 일반적인 메서드가 생성자를 호출할 순 없다.
		// 다른 생성자를 호출하는 이 코드는 생성자의 맨 위에 위치해야한다.
		//매개변수가 없는 생성자로 재어가 바뀜
		//매개변수가있는 생성자의 제어가 끝나면 다시 돌아와서 본 생성자를 실행함
		//생성자를 오버로딩할때
		//다른생성자와 겹치지않도록
		System.out.println("매개변수 없이 인스턴스를 만들었을때");
		System.out.println("이 생성자가 처리할 고유의 코드들");
		
		this.color =color;
		this.wheel = wheel;
		
	}
	
	public Car(int color, int wheel) {
		this.color =color;
		this.wheel =wheel;
	}
	public Car(int color) {
		this.color =color;
	}
	public Car(int color, int whell,float speed) {
		this.color = color;
		this.wheel =wheel;
		this.speed = speed;
	}
}
