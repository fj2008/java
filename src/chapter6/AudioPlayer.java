package chapter6;
//추상 클래스는 다른 클래스의 부모가 될수 있다
//부모 클래스가 추상 클래스라면
//자식 클래스는 부모 클래스에 정의되어 있는
//추상 메서드를 반드시 구현해야 한다.(오버랑이딩)
/*추상클래스
 * 부모클래스가 자식클래스에게 할일을 만들어주는것
 * 하나의 메서드가 자식클래스에 따라 서로다른동작을 하도록강요할때
 * 부모클래스에서는 메서드의 사양만 정의를 하고 자식클래스에서 구체적인 동작을 기술
 * 
 * 
 * */

public class AudioPlayer extends Ex1 {

	@Override
	public void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	
	//부모 클래스에 정의되어 있는 메서드를 자식 클래스에서 재정의 하는것 : 오버라이딩
}
