package chapter2;

public class EX4 {
	//void�� ��ȯ���� ������ ����
	//simple1 �޼���� ���� 1���� �ʿ��� �޼���� ��� �����Ѱ�
	//�Ű������� �ִ� �޼��带 ȣ���Ҷ��� �޼��忡 �´� Ÿ�Կ� �����͸� ȣ���Ұ�
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
	//simple4 �޼���� ���� �ΰ��� �ʿ��� �޼���
	void simple4(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	//simple5 �޼���� ���� �ΰ��� ���� �ϳ��� �ʿ��� �޼���
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
		//ȣ���ϴ� �� = ����
		
		ex4.simple2();
		ex4.simple3("Hello World~!");
		ex4.simple5(1, 20, '+');
	}

}
