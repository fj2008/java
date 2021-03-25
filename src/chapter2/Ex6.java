package chapter2;

public class Ex6 {
	
	public static void main(String[] args) {
		Ex6 ex6 =new Ex6();
		
		int num1 =10;
		System.out.println("before : " + num1);
		ex6.change(num1);
		System.out.println("after : " + num1);
		System.out.println();
		Simpletype1 type = new Simpletype1();
		System.out.println("before : " + type.num1);
		System.out.println("after :" + type.num1);
	}
	void change (int num1) {
		num1 =num1 *10;
		System.out.println("change(int) :" + num1);
	}
	void change1 (Simpletype1 type) {
		type.num1 = type.num1 *10;
		System.out.println("change(SimpleType1) :" + type.num1);
	
	}
}
