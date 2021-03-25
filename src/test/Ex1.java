package test;

import chapter3.TV;

public class Ex1 {

	public static void main(String[] args) {
		
		TV LG_TV = new TV();
		
		LG_TV.setColor("red");
		// 객체지향(기능중심) 프로그래밍은 기능을 중심으로 프로그램을 개발하는 방법
		// 객체를 사용하는 쪽에서는 객체가 제공하는 기능만을 사용해야한다.
		LG_TV.power();
		LG_TV.channelUp();
		//직접 멤버변수를 쓰게되면 프로시져지향 (데이터중심)프로그래밍 기법에 가까워진다.
		//데이터중심으로 개발하게되면 변경사항이 생기게되면 너무 많은수정을 요구한다
		//그래서 객체지향으로 개발 할 수있도록 멤버변수는 다 private를 사용해서 저장한다
		//외부로 공개하면 안되는 데이터를 감추는 갭슐화, 정보 은닉
		LG_TV.channelDown();
		//전원을 켰을 때 현제 채널번호를 알려주고 싶다
		//1.전원을 켜고
		//2.채널번호를 알려준다
		//새로운 맴버변수를 만든다
		System.out.println("현재 채널 번호는" + LG_TV.getChannel()+"번 입니다.");
	}

}
