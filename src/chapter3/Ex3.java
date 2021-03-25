package chapter3;

public class Ex3 {
	//사용자가 한번에 알아볼 수 있게 패키지와 클래스명으로 분명하게 구분해주자
	//프로잭트 = 하나의 완성된 프로그램
	//패키지 = 프로젝트를 완성하기 위한 서비스 들이 들어갈 디렉토리(폴더)
	//클래스= 프로잭트를 완성하기 위한 서비스
	
	int channel ; 
	
	String color;
	
	boolean num1;
	
	void start () {
		num1 = !num1;
		if (num1) {
			System.out.println("전원 켜기"  );
		}else{
			System.out.println("전원 끄기 " );
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
		System.out.println("현제 채널은"+ channel+"입니다.");
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
