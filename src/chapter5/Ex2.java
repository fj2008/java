package chapter5;

public class Ex2 {

	public static void main(String[] args) {
		 Car car = null;
		 FireEngine fe1 = new FireEngine();
		 FireEngine fe2 = null;
		 
		 car = (Car) fe1;
		 fe2 = (FireEngine)car;
		 //��ĳ���� : �ڼ�Ÿ���� ����Ÿ���� ��ȯ�Ҷ� ����ȯ ������ ��������
		 //�ٿ�ĳ���� : ����Ÿ���� �ڼ�Ÿ������ ��ȯ�Ҷ� ����ȯ ������ ���� �Ұ���
		 
		 
		 //car��ü�� �θ�Ŭ�����̱⶧����
		 //fireEngine�� �ִ� �ڽ�Ŭ�������ִ� water ��� �޼ҵ带�� ������ ���� �ʴ�
		 //�׷��⶧���� car��ü�� �ڽ�Ŭ������ �ν��Ͻ��� ����Ű�� �ִ� fe1�� ����ȯ�ؼ� 
		 //����Ҽ� �ְ� �Ǵ��� car��ü�� ���� fe1�� �ν��Ͻ��� ����Ҽ� ������
		 //car��ü���� �ְ� fe1���� �ִ� �ν��Ͻ��� ����Ҽ� �ִ�
		 //������ ������ �ν��Ͻ��� �ٲٰų� �ϴ� ������ �ƴ�
		 
		 
//		 Car car = new Car;
//		 FireEngine fe1 = new FireEngine();
//		 FireEngine fe2 = null;
		 //���Ͱ��� �ڵ�� ����� �� ����
		 //car�� �ִ� �ν��Ͻ��� ����Ʊ⶧��
		 //�׷��� ����ȯ�� �������� �Ұ������� �˷��ִ� �����ڰ� �ִ�
		 //instanceof��¿����ڸ� ���� ��
		 
		 FireEngine fe = new FireEngine();
		 System.out.println(fe instanceof FireEngine);
		 System.out.println(fe instanceof Car);
		 System.out.println(fe instanceof Object);
		 
		 Car car1 = new Car();
		 System.out.println(car1 instanceof FireEngine);
		 System.out.println(car1 instanceof Car);
		 System.out.println(car1 instanceof Object);
		 
//		 car.water();
		 fe1.water();
		 fe2.water();
		 
	}

}
