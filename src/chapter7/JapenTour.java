package chapter7;
//일본 여행을 위한 지식
public class JapenTour implements Providable {

	@Override
	public void leisureSports() {
		System.out.println("도쿄타워에서 번지점프 투어");
	}

	@Override
	public void sightsseing() {
		System.out.println("오사카 관람 투어");
	
	}

	@Override
	public void food() {
		System.out.println("초밥 투어w");
	}

}
