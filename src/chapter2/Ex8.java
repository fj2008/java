package chapter2;

public class Ex8 {
	//��ȯ���� �ִ� �޼��� ����
	//int > add�޼��尡 �����ϰ� ���� ����� ���� �ᱣ���� ���� Ÿ���̶�� ��
	//add > �޼����� �̸�
	//() > �Ű������� �ʿ� ���� �޼���
	
	
	//��ȯ Ÿ�� 
	//- ���� : byte, short, int, long
	//- �Ǽ� : float, double
	//- ���� : char
	//- ���ڿ� : String
	//- �ν��Ͻ� : �ν��Ͻ��� �´� Ŭ���� ��
	
	
	//�޼��� ���� �� return�� ���ԵǾ���Ѵ�
	//return�� �Լ��� ���� �ǹ��ϸ� ���� ������ ���ư���
	double div() {
		int result = 36%5;
		System.out.println(result);
		
		return result;
		
	}
	
	int stackAdd () {
		int result = 1+2+3+4+5;
		System.out.println(result);
		return result;
		
	}

	public static void main(String[] args) {
		Ex8 ex8 =new Ex8();
		ex8.div();
		
		ex8.stackAdd();
	}

}
