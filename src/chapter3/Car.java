package chapter3;

public class Car {
	private int color;
	private int wheel;
	private float speed;
	private double fuel;
	
	public void setColor(int color) {
		this.color = color;
	}
	//�����ڴ� �ν��Ͻ��� ������� ������ �ڵ����� ȣ��Ǵ� �޼���,
	//�Ϲ����� �޼��尡 �ƴϹǷ� �̸��� ������ ����
	//������ �޼����� �̸��� Ŭ������ �̸��� ���ƾ��Ѵ�.
	//������ �޼���� ��ȯŸ���� ����.
	//�������� ���� �����ڴ� public,private �� �ϳ��� �� �� �ִ�.
	//Ŭ�����ȿ� �ν��Ͻ��� ���鶧���� �����ڰ� ȣ���
	//�����ڵ� �޼����̱⶧���� �����ε��� �����ϴ�
	
	public Car() {
		
		this(3,5,0.1f,3.0);
		//�ڵ����� ���� ù��° ������ ����
		color =1;
		//������ ������ 4��������
		wheel =4;
		//�ӷ��� 0
		speed = 0;
		//������� 0
		fuel = 0;
		
		System.out.println("Car Ŭ������ ������ ȣ��");
	}
	
	public Car(int color, int wheel, float speed, double fuel) {
		//������ �ȿ��� �ٸ������ڸ� ȣ���ϴ� ���
		//this(�Ű�����) �� �����ڸ� ȣ���ϴ� ���
		//this()�� ����ϸ� �����ڸ� ȣ���� �� �ִµ�
		//�����ڸ��� �����ڸ� ȣ���� �� �ִ�.
		// �Ϲ����� �޼��尡 �����ڸ� ȣ���� �� ����.
		// �ٸ� �����ڸ� ȣ���ϴ� �� �ڵ�� �������� �� ���� ��ġ�ؾ��Ѵ�.
		//�Ű������� ���� �����ڷ� �� �ٲ�
		//�Ű��������ִ� �������� ��� ������ �ٽ� ���ƿͼ� �� �����ڸ� ������
		//�����ڸ� �����ε��Ҷ�
		//�ٸ������ڿ� ��ġ���ʵ���
		System.out.println("�Ű����� ���� �ν��Ͻ��� ���������");
		System.out.println("�� �����ڰ� ó���� ������ �ڵ��");
		
		this.color =color;
		this.wheel = wheel;
		
	}
	
	public Car(int color, int wheel) {
		this.color =color;
		this.wheel =wheel;
	}
	public Car(int color) {
		this.color =color;
	}
	public Car(int color, int whell,float speed) {
		this.color = color;
		this.wheel =wheel;
		this.speed = speed;
	}
}
