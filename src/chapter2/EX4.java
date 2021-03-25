package chapter2;

public class EX4 {
	//void는 반환값이 없을때 쓴다
	//simple1 메서드는 정수 1개가 필요한 메서드다 라고 선언한것
	//매개변수가 있는 메서드를 호출할때는 메서드에 맞는 타입에 데이터를 호출할것
	void simple1(int val) {
		int rusult = 1 + val;
		System.out.println(val);
	}
	void simple2() {
		System.out.println("hello World~!");
		
	}
	void simple3(String message) {
		System.out.println(message);
	}
	//simple4 메서드는 정수 두개가 필요한 메서드
	void simple4(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	//simple5 메서드는 정수 두개와 문자 하나가 필요한 메서드
	void simple5(int num1, int num2, char var3) {
		if(var3 == '+') {
			System.out.println(num1 + num2);
			
		}else if (var3 == '-') {
			System.out.println(num1 - num2);
		}
		
	}
	public static void main(String[] args) {
		EX4 ex4 =new EX4();
		
		ex4.simple1(1);
		//호출하는 값 = 인자
		
		ex4.simple2();
		ex4.simple3("Hello World~!");
		ex4.simple5(1, 20, '+');
	}

}
