package chapter2;

public class Ex9 {
//��ȯ���� �ְ� �Ű� ������ �ִ� �޼���
	double div(double num1, double num2) {
		double result = num1 / num2;
		
		return result;
	}
	
	int stackAdd(int n) {
		if(n<0||n>100) {
			System.out.println("n�� 0�̻� 100���ϸ� �����մϴ�.");
			return -1;
		}
		int add= 0;
		
		for(int i=1; i<=n; i++) {
			add = add+n;
		}
			return add;
	}
	public static void main(String[] args) {
		Ex9 ex9 = new Ex9();
		
		double result = ex9.div(1.0,2.0);
		System.out.println(result);
		int add = ex9.stackAdd(4);
		System.out.println(add);
	}

}
