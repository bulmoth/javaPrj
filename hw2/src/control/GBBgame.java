package control;

import java.util.Scanner;

public class GBBgame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		while(true) {
			//Ƚ��
			cnt++;
			//������ ����
			int prb = (int)(Math.random()*3);
			//System.out.println(prb);
			//�Է�
			System.out.print("������ ���ðڽ��ϱ�? (����:0, ����:1, ��:2) : ");
			int input = sc.nextInt();
			String match;
			//�������� ������������
			if(prb == 0) {
				match = "����";
			}else if(prb == 1) {
				match = "����";
			}else {
				match = "��";
			}
			//�Է°��� ������������
			String match2;
			if(input == 0) {
				match2 = "����";
			}else if(input == 1) {
				match2 = "����";
			}else {
				match2 = "��";
			}
			//���
			System.out.println("��ǻ�� : " + match);
			System.out.println("����� : " + match2);
			if(prb-input == -1 || prb-input == 2) {
				System.out.println("����� ��");
				System.out.println(cnt + "�� ���� �¸��ϼ̽��ϴ�.");
				//�ٽ��ϱ� ����
				System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y:1/n:0) : ");
				int re = sc.nextInt();
				if(re == 1) {
					cnt = 0;
					continue;
				}else if(re == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}else {
				System.out.println("��ǻ�� ��");
			}
			
			
			
			
		}//while
		
	}//main

}//class
