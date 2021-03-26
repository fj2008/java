package chapter4;

public class Ex2 {

	public static void main(String[] args) {
		Parent2 parent = new Parent2();
		
		System.out.println(parent.num);
		
		parent.setNum(10);
		System.out.println(parent.getNum());
		
		System.out.println("===== =====");
		
		Child2 child2 = new Child2 ();
		
		System.out.println(child2.num);
	}

}
