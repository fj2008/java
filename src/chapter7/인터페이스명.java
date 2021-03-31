package chapter7;

public interface 인터페이스명 {
	//클래스(static) 상수(final) 멤버 변수
	public static final int memVal1 = 10;
	
	static final int memVal2 = 20;
	final int memVal3 =30;
	int memVal4 = 40;
	
	// 추상 메서드
	public abstract void memMethod1();
	
	abstract void memMethod2();
	
	void memMethod3();
	
	//만 가질 수 있음
}//위와같이 코드를 다 안붙혀도 컴파일러가 컴파일할때 완성시켜줌
//하지만 그렇다해서 코드를 빼서 작성하지말자
//실무할때 욕먹는다
