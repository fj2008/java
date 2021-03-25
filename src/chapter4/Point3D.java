package chapter4;
//3차원의 한 점을 표현하기 위한 클래스
public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}
	//오버라이딩: 부모 클래스에 정의되어있는 메서드를 자식 클래스에서 새로이 재정의하는 것
	
	public String getLocation() {
		int x = getX();
		int y = getY();
		
		return "x :" + x + ",y:" +y +",z: " +z;
	}
	
	
	
}
