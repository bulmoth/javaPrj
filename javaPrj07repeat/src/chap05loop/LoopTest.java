package chap05loop;

public class LoopTest {

	//�ݺ���
	/*
	 * for
	 * while
	 * do-while
	 * 
	 * break 	: ���� �ݺ��� Ż��
	 * continue : ���� �ݺ��� ó������ �̵�
	 */
	
	//for
	//n�� hello world ���
	public void test() {
		int n = 3;
		for(int i=0; i<n; i++) {	//�ʱ��; ���ǽ�; ������
			System.out.println("hello world");
		}
	}//test
	
	//while
	//n�� hello world ���
	public void test2() {
		int n =5;
		int i = 0;	//�ʱ��
		while(i < n) {	//���ǽ�
			System.out.println("hello world");
			i++;	//������
		}
	}//test2
	
	//do - while
	//n�� hello world ���
	public void test3() {
		int n = 7;
		int i = 0;	//�ʱ��
		do {
			System.out.println("hello world");
			i++;	//������
		}while(i < n);	//���ǽ�
	}
	
	
}//class
