package chapter2;

public class Ex8 {
	//반환값이 있는 메서드 선언
	//int > add메서드가 동작하고 나서 만들어 내는 결괏값이 정수 타입이라는 것
	//add > 메서드의 이름
	//() > 매개변수가 필요 없는 메서드
	
	
	//반환 타입 
	//- 정수 : byte, short, int, long
	//- 실수 : float, double
	//- 문자 : char
	//- 문자열 : String
	//- 인스턴스 : 인스턴스에 맞는 클래스 명
	
	
	//메서드 내에 꼭 return이 포함되어야한다
	//return은 함수의 끝을 의미하며 값을 가지고 돌아간다
	double div() {
		int result = 36%5;
		System.out.println(result);
		
		return result;
		
	}
	
	int stackAdd () {
		int result = 1+2+3+4+5;
		System.out.println(result);
		return result;
		
	}

	public static void main(String[] args) {
		Ex8 ex8 =new Ex8();
		ex8.div();
		
		ex8.stackAdd();
	}

}
