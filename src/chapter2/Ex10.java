package chapter2;

public class Ex10 {
	/*�޼��� �����ε�
	 * �޼����� �̸��� ������ �Ű������� �޸��ؼ� �������� �޼��带 ����°�
	 * �̸� �����ε��� �޼����� ǥ���Ѵ�.
	 * ����
	 * �޼��� �̸��� ���ƾ��Ѵ� && �Ű������� ���� �Ǵ� Ÿ���� �޶���Ѵ�.
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
		System.out.println("�ν��Ͻ� ��� �޼���");
		
	}
	static void classMemberMethod() {
		System.out.println("Ŭ���� ��� �޼���");
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
		
		
		//���� �Է��ϸ� ��ǻ�Ͱ� �˾Ƽ� �� ���� �´� �Ű������� ������ Ÿ���� �Ǵ��ؼ� �׿��´� �޼��带 �����ϰ� return�ȴ�
		
		
		/*�޼��� ����
		 * �ν��Ͻ� ��� �޼���
		 * Ŭ���� ��� �޼���
		 * 
		 * 
		 * 
		 */
		 
		

	}

}
