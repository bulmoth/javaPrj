package main;

public interface Car {
	
	/*
	 * �������̽�
	 * 
	 * ��� �޼ҵ�� �߻� �޼ҵ��̴�.
	 * ��� �޼ҵ�� public abstract �̴�
	 * public abstract �� ������ �����ϴ�.
	 */
	
	//��� �ڵ����� ���������� ������ �� �޼ҵ� (�߻� �޼ҵ�)
	
	String startCar();		// == public abstract String StartCar();
	void go();
	int stop();

}
