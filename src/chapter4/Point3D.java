package chapter4;
//3������ �� ���� ǥ���ϱ� ���� Ŭ����
public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}
	//�������̵�: �θ� Ŭ������ ���ǵǾ��ִ� �޼��带 �ڽ� Ŭ�������� ������ �������ϴ� ��
	
	
	

	@Override//annotation �̶���� �ּ��ε� ��ǻ�Ͱ� �����ϴ� �ּ� � ������ �ϴ� �ּ�
	public String getLocation() {
		
		return super.getLocation()+ ", z :" + z;
		//super��� Ŭ������ �θ��� ���� �ؼ��ϸ� �θ�Ŭ�������� getLocation�� ȣ���Ѵٰ���
	}
	

	
	
}
