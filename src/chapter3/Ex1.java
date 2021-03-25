package chapter3;

public class Ex1 {
	int num1;
	double num2;
	char num3;
	String num4;
	//메서드 안에서 멤버변수에 접근해보자
	void func1 () {
		System.out.println(this.num1);
	}//num1 인스턴스에 들어있는 값을 출력해라
	void func2 () {
		System.out.println(this.num2);
	}
	void func3 () {
		System.out.println(this.num3);
		
	}
	void func4 () {
		System.out.println(this.num4);
		
	}
	//this라는 키워드는'이 인스턴스에 있는' 이라는 뜻

	public static void main(String[] args) {
		/*클래스 심화
		 * 속성: 멤버 변수, 특성, 필드 상태
		 * 기능 : 메서드, 함수, 행위
		 * */
		
		
		
	}

}
