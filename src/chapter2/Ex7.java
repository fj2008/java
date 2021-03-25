package chapter2;

public class Ex7 {

	public static void main(String[] args) {
		Ex7 ex7 =new Ex7();
		Simpletype1 type = new Simpletype1();
		type.num1 =10;
		System.out.println("before : " + type.num1);
		ex7.change1 (type);
		System.out.println("after :" + type.num1);
		
		int [] arr = {1,2,3};
		System.out.println("before : " + arr[0]);
		ex7.change (arr);
		System.out.println("after :" + arr[0]);
		//변수는 복사가 돼서 매개변수에 들어가는 반면
		//객체나 배열은 메모리주소가 복사가 되기때문에 그이후에 값에대한 영향력이 있음
		//렘안에있는 값을 변환시킬수 있다
		
	}
	
	
	void change1 (Simpletype1 type) {
		type.num1 = type.num1 *10;
		System.out.println("change(SimpleType1) :" + type.num1);
	
	}
	
	void change (int [] arr) {
		System.out.println("change(int[]) :" + arr[0]);
	}
	
	void change2 ( int num1 ) {
		num1 = num1 * 10;
		
		System.out.println("change(int[]) :" + num1);
	}
}
