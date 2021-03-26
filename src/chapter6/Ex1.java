package chapter6;

public abstract class Ex1 {
	
	public abstract void play (int pos);
	public abstract void stop ();
	
		
	
	
}
//추상 클래스.
	//클래스가 설계도라면
	//추상클래스는 미완성설계도(미완성된 클래스)
	//메서드가 완성되지않은 클래스라는뜻
	//클래스이나 인스턴스를 만들수 없다.
	//문법 abstract class
	//부모 클래스만 될수 있음
	//미완성된 메서드를 하나이상갖고있는 클래스
	//구현이 돼있으면 안됨 선언만 돼있어야함
	//추상메서드를 가지고있는 클래스는 클래스또한 추상클래스여야한다
	//추상 클래스는 추상메서드가 필수가 아님
//추상 클래스 타입의 객체는 생성 가능하지만
		//추상 클래스의 인스턴스는 생성할 수 없다.
		
		//Ex1 ex1 =new Ex1();
		