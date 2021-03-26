package chapter6;

public abstract class Animal {
	private String name;
	//����� ������ (0 �ſ� ����� ,10�� �ſ� ��θ�)
	private int hungry;
	
	
	public Animal() {
		this("animal");
	}	
	public Animal(String name) {
		this.name = name;
		
	}
	public String getMyName() {
		return name;
	}
	public abstract void run();
	public abstract void findFood();
	public abstract void eatFood();
	//�������� ����� �� ������ ã�Ƽ� �����Ƿ�
	//eat �޼��带 ����ؼ� ������ٸ�if (hungry <=5) {
	//������ ã�� �Ե��� �����Ͽ���.
	//�̶�, ������ ���� ������ ã�� ����� �� �ٸ��Ƿ� findFood�޼���� �߻�޼����
	//������ ���� ������ �Դ� ����� �� �ٸ��Ƿ� eatFood�޼���� �߻�޼���� �����Ͽ���
	
	public void eat() {
		if (hungry <=5) {
			//������ ã�´�.
			findFood();
			
			//������ �Դ´�.
			eatFood();
		}
	}
	
}
