package chapter2;

public class Ex10 {
	/*메서드 오버로딩
	 * 메서드의 이름은 같지만 매개변수를 달리해서 여러개의 메서드를 만드는것
	 * 이를 오버로딩된 메서드라고 표현한다.
	 * 조건
	 * 메서드 이름이 같아야한다 && 매개변수의 개수 또는 타입이 달라야한다.
	 * 
	 * */
	int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}
	double add(double avg1,double avg2) {
		double result = avg1 + avg2;
		return result;
	}
	
	double add (int num1, double avg1) {
		double result = (int)num1 + avg1;
		
		return result;
		
	}
	void instanceMemberMethod() {
		System.out.println("인스턴스 멤버 메서드");
		
	}
	static void classMemberMethod() {
		System.out.println("클래스 멤버 메서드");
	}

	public static void main(String[] args) {
		Ex10 ex10 = new Ex10();
		
		ex10.add(1, 1);
		ex10.add(1, 1.0);
		ex10.add(1.0, 13.8);
		ex10.instanceMemberMethod();
		Ex10.classMemberMethod();
		
	int num1;
	
	static int num2;
		
		
		//값을 입력하면 컴퓨터가 알아서 그 값에 맞는 매개변수의 갯수나 타입을 판단해서 그에맞는 메서드를 실행하고 return된다
		
		
		/*메서드 종류
		 * 인스턴스 멤버 메서드
		 * 클래스 멤버 메서드
		 * 
		 * 
		 * 
		 */
		 
		

	}

}
