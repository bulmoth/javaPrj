package com.kh.obj;

import java.util.Date;
import com.kh.main.Run;

public class Eye {
	
	
	
	//data
	private boolean isBright;		//�ѱ� ��, ��
	private int eyelash;			//�Ӵ��� ����(mm)
	private String answer = "";
	
	
	//Constructor
	public Eye() {
		this.isBright = true;
		this.eyelash = 5;
	}
	
	//getter setter
	public boolean getIsBright() {
		return this.isBright;
	}
	public void setIsBright(boolean isBright) {
		this.isBright= isBright; 
	}
	
	public int getEyelash() {
		return this.eyelash;
	}
	public void setEyelash(int eyelash) {
		this.eyelash = eyelash;
	}
	
	//method
	
	public String starting() {
		Date today = new Date();
		System.out.println("\n�� �մ�...");
		System.out.println("������ " + today + " �³�?");
		System.out.println("-�¾�\t-Ʋ��");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("�¾�")) {
			this.isBright = true;
			System.out.println("�׷� �ƾ�.\n���� �� �ð谡 ���� ������ �ǰŵ�.");
		}else {
			this.isBright = false;
			System.out.println("�׷�?\n�׷� ���� ���µ�...");
		}
		
		if(isBright) {
			return "�ѱⰡ �ִ� ";
		}else {
			return "�ѱⰡ ���� ";
		}
	}//starting
	
	public String typhoon() {
		System.out.println("\n ��ǳ�� �´ٴ���...");
		System.out.println("�� ��̸��� �ñ�?");
		
		answer = Run.sc.nextLine();
		
		this.eyelash = Integer.parseInt(answer);
		return Integer.toString(eyelash) + "mm�� �Ӵ����� ���� ";
	}
	
	
}//class
