package chapter7;
//클래스의 상속은 한번에 하나의 클래스만 상속할 수 있다.
//(클래스는 단일 상속만 가능)
//인터페이스의 상속은 한번에 여러 인터페이스를 상속할 수 있다.
//(인터페이스는 다중 상속 가능)
public interface C extends B,A {
	public static final int a = 10 ;
	
	public abstract void method1();
	

}
