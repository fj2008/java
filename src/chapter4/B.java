package chapter4;
//����� ������ �θ� Ŭ������ �ִ� ��κ��� ��� ������ ��� �޼��带 ����� �� �ִ�.

// �θ� Ŭ������ ���ǵǾ� �ִ� �����ڴ� ��� ���� �� ����.

// private ���� �����ڷ� �Ǿ��ִ� ��� ����, �޼���� ����� �ޱ�� ������
// �ڽ� Ŭ������ ������ �� ���� ����� ���·� ����� �޴´�.
public class B extends A{

	public void showNum1() {
		System.out.println(this.num1);
		
	//	System.out.println(this.num2);
		System.out.println(getNum2());
		setNum2(10);
	}
}
