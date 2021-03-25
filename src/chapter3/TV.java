package chapter3;

public class TV {
	
	//객체지향으로 개발 할 수있도록 멤버변수는 다 private를 사용해서 저장한다
	//외부로 공개하면 안되는 데이터를 감추는 캡슐화, 정보 은닉
	private String color;
	private boolean power;
	private int channel;
	private int volumn;
	private int hour;
	private int minute;
	private int second;
	
	//객체지향은 데이터들을 갖고 있을 객체를 생각해야하고
	//객체가 제공하는 기능을 설계해야하므로
	//프로젝트 개발 기간이 길어지는 단접이 있음
	//프로젝트의 규모가 커지면 점점 복잡해짐
	//프로젝트를 객체지향적으로 잘 설계를 해 두면
	//유지보수에 속도가 굉장히 빨라진다.
	
	
	//프로시져지향은 데이터만 생각하면 되므로
	//프로젝트 개발 기간이 상대적으로 짧은 장점이 있음
	//그러나 프로젝트의 규모가 커지면 데이터가 거미줄처럼 얽혀서 사용되므로
	//유지보수 속도가 굉장히 느려진다.
	
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
	//setter > private 접근 제어자인 멤버 변수에 원하는 값을 설정해야할 때 필요한 메서드
	public void setColor(String color) {
		// tv의 컬러는 red,blue만 가능하다.
		if(color.equals("red") || color.equals("blue")) {
			this.color = color;
		}else {
			System.out.println("컬러는 레드와 블루만 됩니다.");
		}
		this.color = color;
	}
	
	//위와같이 사용가능한 멤버변수를 만들때 get~~로 붙여준다
	
	public String getColor() {
		return color;
		
	}
	public int getChannel() {
		return channel;
	}
	public boolean getPower() {
		return power;
	}
	//멤버 메서드의 경우에는 private와 public을 가려가며 쓴다
	
	//일반적인 좋은 메서드 = 한번에 하나의 기능만 제공하는 메서드
	//power메서드를 보면
	//1.전원을 켜고
	//2.현제 채널 번호를 알려준다
	//기능이 여러게임 이러면 개발하다가 곤란한 상황이 생길 수 도 있다.
	public void power() {
		power = !power;
		
		if (power) {
			System.out.println("전원을 켰습니다");
			showChannel();
			
		}else {
				System.out.println("전원을 켰습니다");
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
	//channelUP /Down을 위한 메서드
	//수정하면 안되는 메서드
	
	private void showChannel() {
		System.out.println("지금 보시는 체널은"+ channel +"번 입니다");
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
