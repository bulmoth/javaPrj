package chap03oper;

public class OperTest {

	//������
	
	/*
	 * 1. ���
	 * 2. ��
	 * 3. ��
	 */
	
	//������ �켱����
	//ǥ�� �ܿ� �ʿ�� ����
	//�츮�� ��ȣ�� �ֱ� ������...
	//�򰥸���, ��ȣ�� Ȱ���ϸ� �ȴ�!
	
	public void test() {
		//��� ������
		//+, -, *, /, %, =
		//���� ���� => ����
		//1 + 1 => 2
		System.out.println(1+1);
		
	}
	
	public void test2() {
		//�� ������
		//<, >, <=, >=, ==, !=
		//���� ���� => ��
		//1 < 2 => true
		System.out.println(1<2);
	}
	
	public void test3() {
		//�� ������
		//&&, ||, !
		//�� �� => ��
		//true && flase => false
		System.out.println(true && false);
	}
	
	public void test4() {
		//���� ������
		//? :
		//? ���� ���� true ���? �ݷ�(:) ������ ���� ����
		//? ���� ���� false ���? �ݷ�(:) �������� ���� ����
		int x;
		x = 1 > 2 ? 100 : -99;
		System.out.println(x);
	}
	
}//class
