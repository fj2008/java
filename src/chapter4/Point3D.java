package chapter4;
//3차원의 한 점을 표현하기 위한 클래스
public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}
	//오버라이딩: 부모 클래스에 정의되어있는 메서드를 자식 클래스에서 새로이 재정의하는 것
	
	
	

	@Override//annotation 이라고함 주석인데 컴퓨터가 참고하는 주석 어떤 역할을 하는 주석
	public String getLocation() {
		
		return super.getLocation()+ ", z :" + z;
		//super라는 클래스는 부모라는 뜻임 해석하면 부모클래스에서 getLocation을 호출한다고함
	}
	

	
	
}
