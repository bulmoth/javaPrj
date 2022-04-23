package com.kh.obj;

import com.kh.main.Run;

public class Hair extends Character{
	
	//Object
	Character c = new Character();
	
	//data
	private boolean isCurl;		//����, ����
	private boolean isBususu;	//�������� �ƴ���
	private String answer = "";
	
	//Constructor
	public Hair() {
		this.isCurl = false;
		this.isBususu = false;
	}
	
	//getter setter
	public boolean getIsCurl() {
		return this.isCurl;
	}
	public void setIsCurl(boolean isCurl) {
		this.isCurl= isCurl; 
	}
	
	public boolean getIsBususu() {
		return this.isBususu;
	}
	public void setIsBususu(boolean isBususu) {
		this.isBususu = isBususu;
	}
	
	//method
	public String rain() {		//������
		System.out.println("\n �� ���� ������...");
		System.out.println("�� ������ �� ������?");
		System.out.println("-��\t-�ƴ�");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("��")) {
			this.isCurl = false;
			System.out.println("�׷�����. ���� ���Ҹ��� ��Ⱑ ����.");
		}else {
			this.isCurl = true;
			System.out.println("�׷�����. �����ؼ� ���α� ����.");
		}
		
		if(isCurl) {
			return "������ ";
		}else {
			return "������ ";
		}
	}//rain
	
	public String hurry() {		//����
		System.out.println("\n���� ���� �긮��. �پ�Գ���?");
		System.out.println("-��\t-�ƴ�");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("��")) {
			this.isBususu = true;
			System.out.println("��¾��...������ �� Ʋ���ٰ�.");
		}else {
			this.isBususu = false;
			System.out.println("�׷�? ���Ͱ� Ʋ���� �־�������.");
		}
		
		if(isBususu) {
			return "������� ";
		}else {
			return "������ ";
		}
	}//hurry
	
	public String hair(String len) {		//�Ӹ�����
		switch(len) {
		case "+" :
			return "�� ";
		case "-" :
			return "ª�� ";
		default :
			return "�̵����� �ƴ� ";	
		}
	}//hairL
	
	public String hair(char color) {		//�Ӹ���
		switch(color) {
		case 'R' :
			return "������ �Ӹ�Į�� ";
		case 'Y' :
			return "��� �Ӹ�Į�� ";
		case 'K' :
			return "���� �Ӹ�Į�� ";
		default :
			return "�� �Ӹ�Į�� ";
		}
	}//hairC
	

}//class
