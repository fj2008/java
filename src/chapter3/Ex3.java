package chapter3;

public class Ex3 {
	//����ڰ� �ѹ��� �˾ƺ� �� �ְ� ��Ű���� Ŭ���������� �и��ϰ� ����������
	//������Ʈ = �ϳ��� �ϼ��� ���α׷�
	//��Ű�� = ������Ʈ�� �ϼ��ϱ� ���� ���� ���� �� ���丮(����)
	//Ŭ����= ������Ʈ�� �ϼ��ϱ� ���� ����
	
	int channel ; 
	
	String color;
	
	boolean num1;
	
	void start () {
		num1 = !num1;
		if (num1) {
			System.out.println("���� �ѱ�"  );
		}else{
			System.out.println("���� ���� " );
		}
	}
	void channelUp() {
		channel ++;
		channel();
	}
	void channelDown() {
		channel --;
		channel();
	}
	void channel() {
		System.out.println("���� ä����"+ channel+"�Դϴ�.");
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
