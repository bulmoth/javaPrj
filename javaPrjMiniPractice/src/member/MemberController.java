package member;

import java.util.Scanner;

public class MemberController {
	
	Scanner sc = new Scanner(System.in);
	
	public void memberJoin() {
		System.out.println("===== ȸ������ ���� =====");
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pwd = sc.nextLine();
		
		//ȸ������ ���� ���� üũ
		boolean checkResult = checkMember(id);
		if(checkResult) {
			insertMember(id, pwd);
		}else {
			System.out.println("ȸ�� ���� ���� !");
		}
		
	}
	
	//����Ͻ� ���� ó�� (==service ����)
	private boolean checkMember(String id) {
		//���̵� �ߺ� üũ�ؼ�, ��� ����
		//���̵� �����ڸ� ��Ī�� ������ ������ ���� ó��
		if("admin".equals(id)) {
			return false;
		}
//		else if(/*� ȸ������ �Ұ����� ���*/){
//			return false
//		}
		else {
		
			return true;
		}
	}

	//������ ����(data ����)
	private void insertMember(String id, String pwd) {
		//���� ��ü ����
		//���� ��ü�κ��� ��Ʈ�� ����
		//��Ʈ���� �̿��ؼ� ����Ƽ ����
		System.out.println("ȸ������ �Ϸ� !");
	}

}
