package chapter5;

public class Ex1 {

	public static void main(String[] args) {
		/*다형성 기초!! 가장중요!
		 * 객체지향코딩의 시작점
		 * 
		 * 
		 * */
		
		TV tv = new TV();
		
		CaptionTV captiontv = new CaptionTV();
		
		//다형성 - tv2라는 객체는 TV타입의 객체이면서
		//		 TV 클래스의 자식 클래스인 CaptionTV 타입의 객체도 된다.
		TV tv2 = new CaptionTV();
		//단 밑에와 같이 자식 타임의 객체가 부모 타입의 인스턴스를 가리킬 수는 없음
		//그 이유는 자식클래스에는 있는 변수와 메서드들이 부모클래스에는 없기때문에 호출할수 없다
		//CaptionTV captiontv = new TV(); 
		
		
		
	}

}
