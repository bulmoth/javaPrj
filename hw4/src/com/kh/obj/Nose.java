package com.kh.obj;

import com.kh.main.Run;

public class Nose extends Character{
	
	//Object
	Character c = new Character();
	
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
	
	public String window() {		//�ڸ��
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
	
	public String meat() {		//���� �Ǽ�
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
	
	@Override
	public String len() {		//�� ũ��
		switch(super.len()) {
		case "+" :
			return "ū ���� ";
		case "-" :
			return "���� ���� ";
		default :
			return "�߰� ũ���� ���� ";	
		}
	}//len
	
	@Override
	public String color() {		//�� ��
		switch(super.color()) {
		case "R" :
			return "���� �� ";
		case "Y" :
			return "��� �� ";
		case "K" :
			return "���� �� ";
		default :
			return "�źθ� �� ";
		}
	}//color

}//class
