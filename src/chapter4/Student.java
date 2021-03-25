package chapter4;

public class Student extends Person {
	//상속의 주의사항
	//클래스 내 코드가 중복된다고 해서 무조건 상속을 사용하면 안된다.
	//person,student 클래스처럼 공통된 특징이 있는 상태에서
	//코드가 중복될 경우에만 상속을 사용할 수 있다.
	

	//공통된특징과 코드가 중복될때에만 사용하자
	//부모클래스는 물려주기만 하는 객체임 그래서 자식클래스에있는 멤버메서드 사용불가
	//자식클래스는 또다른클래스의 부모클래스가 될수있다.
	
	public void study() {
		System.out.println("공부하기");
	}
	public void run() {
		System.out.println("달리기");
	}


	

}
/*공통된 특징을 지니는 클래스들을 만들때
 * 하나의 클래스가 갖고 있는 요소를 물려받는 방법
 * 자신의 요소를 나눠주는 클래스를 부모클래스
 * 그걸 받는클래스가 자식클래스
 * public class 클래스명extends 부모클래스명
 * 
 * */
 */