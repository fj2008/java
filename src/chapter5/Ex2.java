package chapter5;

public class Ex2 {

	public static void main(String[] args) {
		 Car car = null;
		 FireEngine fe1 = new FireEngine();
		 FireEngine fe2 = null;
		 
		 car = (Car) fe1;
		 fe2 = (FireEngine)car;
		 //업캐스팅 : 자손타입을 조상타입을 변환할때 형변환 연산자 생략가능
		 //다운캐스팅 : 조상타입을 자손타입으로 변환할때 형변환 연산자 생략 불가능
		 
		 
		 //car객체는 부모클래스이기때문에
		 //fireEngine에 있는 자식클래스에있는 water 멤버 메소드를를 가지고 있지 않다
		 //그렇기때문에 car객체에 자식클래스에 인스턴스를 가리키고 있던 fe1을 형변환해서 
		 //사용할수 있게 되더라도 car객체에 없는 fe1에 인스턴스는 사용할수 없지만
		 //car객체에도 있고 fe1에도 있는 인스턴스는 사용할수 있다
		 //하지만 서로의 인스턴스를 바꾸거나 하는 개념이 아님
		 
		 
//		 Car car = new Car;
//		 FireEngine fe1 = new FireEngine();
//		 FireEngine fe2 = null;
		 //위와같은 코드는 실행될 수 없다
		 //car에 있는 인스턴스가 선언됐기때문
		 //그래서 형변환이 가능한지 불가능한지 알려주는 연산자가 있다
		 //instanceof라는연산자를 쓰면 됨
		 
		 FireEngine fe = new FireEngine();
		 System.out.println(fe instanceof FireEngine);
		 System.out.println(fe instanceof Car);
		 System.out.println(fe instanceof Object);
		 
		 Car car1 = new Car();
		 System.out.println(car1 instanceof FireEngine);
		 System.out.println(car1 instanceof Car);
		 System.out.println(car1 instanceof Object);
		 
//		 car.water();
		 fe1.water();
		 fe2.water();
		 
	}

}
