package com.kh.obj;

import com.kh.main.Run;

public class Nose {
	
	//data
	private String shape;		//���׶� ��, ���� ��
	private boolean isOily;		//���� �Ǽ�
	private String answer = "";
	
	//Constructor
	public Nose() {
		this.shape = "���׶� ��";
		this.isOily = false;
	}
	
	//getter setter
	public String getShape() {
		return this.shape;
	}
	public void setShape(String shape) {
		this.shape= shape; 
	}
	
	public boolean getIsOily() {
		return this.isOily;
	}
	public void setIsOily(boolean isOily) {
		this.isOily = isOily;
	}
	
	//method
	
	public String window() {
		System.out.println("\n�Ʊ���� â���� ������ ���� �� ������...");
		System.out.println("-����?\t-���� ��?");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("����?")) {
			this.shape = "���׶� ���� ";
			System.out.println("�ƴϾ�? �� �����ΰ�...");
		}else {
			this.shape = "���� ���� ";
			System.out.println("�� �����ڴ���.");
		}
		
		return this.shape;
	}//window
	
	public String meat() {
		System.out.println("\n���� ���ִ� ��⸦ �Ծ��µ� ���̾�...");
		System.out.println("�ʵ� ��� ������?");
		System.out.println("-��\t-�ƴ�");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("��")) {
			this.isOily = true;
			System.out.println("����. ���߾��̱���.");
		}else {
			this.isOily = false;
			System.out.println("�����ؼ� ���α���? �׷� �� ����.");
		}
		
		if(isOily) {
			return "������ ";
		}else {
			return "�Ǽ��� ";
		}
	}//meat

}//class
