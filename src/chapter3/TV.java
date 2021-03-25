package chapter3;

public class TV {
	
	//��ü�������� ���� �� ���ֵ��� ��������� �� private�� ����ؼ� �����Ѵ�
	//�ܺη� �����ϸ� �ȵǴ� �����͸� ���ߴ� ĸ��ȭ, ���� ����
	private String color;
	private boolean power;
	private int channel;
	private int volumn;
	private int hour;
	private int minute;
	private int second;
	
	//��ü������ �����͵��� ���� ���� ��ü�� �����ؾ��ϰ�
	//��ü�� �����ϴ� ����� �����ؾ��ϹǷ�
	//������Ʈ ���� �Ⱓ�� ������� ������ ����
	//������Ʈ�� �Ը� Ŀ���� ���� ��������
	//������Ʈ�� ��ü���������� �� ���踦 �� �θ�
	//���������� �ӵ��� ������ ��������.
	
	
	//���ν��������� �����͸� �����ϸ� �ǹǷ�
	//������Ʈ ���� �Ⱓ�� ��������� ª�� ������ ����
	//�׷��� ������Ʈ�� �Ը� Ŀ���� �����Ͱ� �Ź���ó�� ������ ���ǹǷ�
	//�������� �ӵ��� ������ ��������.
	
	public TV () {
		color = "black";
		power = false;
		channel = 1;
				
	}
	public TV (String color, int channel) {
		this.color = color;
		this.channel = channel;
		
	}
	
	public TV (int hour, int minute) {
		this.hour =hour;
		this.minute =minute;
		
	}
	//setter > private ���� �������� ��� ������ ���ϴ� ���� �����ؾ��� �� �ʿ��� �޼���
	public void setColor(String color) {
		// tv�� �÷��� red,blue�� �����ϴ�.
		if(color.equals("red") || color.equals("blue")) {
			this.color = color;
		}else {
			System.out.println("�÷��� ����� ��縸 �˴ϴ�.");
		}
		this.color = color;
	}
	
	//���Ͱ��� ��밡���� ��������� ���鶧 get~~�� �ٿ��ش�
	
	public String getColor() {
		return color;
		
	}
	public int getChannel() {
		return channel;
	}
	public boolean getPower() {
		return power;
	}
	//��� �޼����� ��쿡�� private�� public�� �������� ����
	
	//�Ϲ����� ���� �޼��� = �ѹ��� �ϳ��� ��ɸ� �����ϴ� �޼���
	//power�޼��带 ����
	//1.������ �Ѱ�
	//2.���� ä�� ��ȣ�� �˷��ش�
	//����� �������� �̷��� �����ϴٰ� ����� ��Ȳ�� ���� �� �� �ִ�.
	public void power() {
		power = !power;
		
		if (power) {
			System.out.println("������ �׽��ϴ�");
			showChannel();
			
		}else {
				System.out.println("������ �׽��ϴ�");
		}
	}
	
	public void channelUp() {
		channel ++;
		showChannel();
		
	}
	public void channelDown() {
		channel --;
		showChannel();
		
	}
	//channelUP /Down�� ���� �޼���
	//�����ϸ� �ȵǴ� �޼���
	
	private void showChannel() {
		System.out.println("���� ���ô� ü����"+ channel +"�� �Դϴ�");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getVolumn() {
		return volumn;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
