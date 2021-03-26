package chapter4;
//모든 클래스의 최상위 보무 클래스는 object 클래스가 된다
//상속을 받지 않는 모든 클래스는 object 클래스를 자동으로 상속 
받는다.
public class A {
	public int num1;
	private int num2;
	int num3;
	protected int num4;
	
	
	public int getNum2() {
		return num2;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public void setNum3(int num3) {
		this.num3 = num3;
	}


	public void setNum4(int num4) {
		this.num4 = num4;
	}
}
