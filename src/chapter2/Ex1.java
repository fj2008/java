package chapter2;

public class Ex1 {
//Ex1 클래스는 메서드를 만들고
//만든 메서드를 실행할 클래스
//메서드를 만든다 -. 메서드를 정의한다/ 선언한다
//메서드 선언
	// 반환타입 메서드이름(매개변수1,매개변수2){
	//		소스코드1
	//		소스코드2
	//}
	void simple1() {
		System.out.println("Hello World~!");
	}
	void simple2() {
		System.out.println("Java Program Start!");
	}
	
	
	public static void main(String[] args) {
		// simple1 메서드 호출
		Ex1 ex1 = new Ex1();
		//클래스 인스턴스 생성후 호출
		ex1.simple1();
		
		Ex2 ex2 = new Ex2();
		ex2.simple1();
		ex2.simple2();
		
		Ex3 ex3 = new Ex3();
		
		ex3.simple4();
		//메서드의이름에 의도를 표현해서 뭘 위한 메서드인지 확실히 알수있는 이름을 지어주자

	}

}
