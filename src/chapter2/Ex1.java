package chapter2;

public class Ex1 {
//Ex1 Ŭ������ �޼��带 �����
//���� �޼��带 ������ Ŭ����
//�޼��带 ����� -. �޼��带 �����Ѵ�/ �����Ѵ�
//�޼��� ����
	// ��ȯŸ�� �޼����̸�(�Ű�����1,�Ű�����2){
	//		�ҽ��ڵ�1
	//		�ҽ��ڵ�2
	//}
	void simple1() {
		System.out.println("Hello World~!");
	}
	void simple2() {
		System.out.println("Java Program Start!");
	}
	
	
	public static void main(String[] args) {
		// simple1 �޼��� ȣ��
		Ex1 ex1 = new Ex1();
		//Ŭ���� �ν��Ͻ� ������ ȣ��
		ex1.simple1();
		
		Ex2 ex2 = new Ex2();
		ex2.simple1();
		ex2.simple2();
		
		Ex3 ex3 = new Ex3();
		
		ex3.simple4();
		//�޼������̸��� �ǵ��� ǥ���ؼ� �� ���� �޼������� Ȯ���� �˼��ִ� �̸��� ��������

	}

}
