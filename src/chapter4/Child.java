package chapter4;

public class Child extends Parent {
	//�θ� Ŭ�����κ��� ��� ���� ������ �����ϴ� x
	//�θ�Ŭ������ �Ű��������ִٸ� ���� �Ű������� �°� ȣ���� �������
	public int x;
	public int y;
	
	public Child () {
		this(0,0);
		System.out.println("�Ű������� ���� ������");
	}
	
	
	public Child (int x, int y) {
		
		System.out.println("�Ű����� �ִ� ������");
		this.x = x;
		this.y = y;
	}
	
	//�ڽ� Ŭ������ �ν��Ͻ��� ����� ����
	//�θ� Ŭ������ ������� ���� �����ϹǷ�
	
	//�ڽ� Ŭ������ �����ڸ� ����ٸ�
	//�ڽ� Ŭ������ �������� �� ó���� �θ� Ŭ������ �����ڸ� ȣ���ؾ��Ѵ�.
	//���� �θ�Ŭ���� ȣ���� ���� �ʴ��������Ϸ��� �ڵ����� �θ�Ŭ������ ȣ���ع���
	//�������� ��Ģ�� �ٲܼ� ����
	public Child (int x,int y) {
		
		System.out.println("�ڽ� Ŭ������ ������");
		this.x = x;
		this.y = y;
		
	}
	
	
	
	public void method() {
		System.out.println("x = " + x);
		//�ڽ�Ŭ������ �������� ���� �����Ѵ�. �����ÿ� ��ӹ��� ������� ����
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method();
		child.x();
		child.y();
	}
	
	
}
