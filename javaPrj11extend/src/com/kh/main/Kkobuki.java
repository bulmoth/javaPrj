package com.kh.main;

public class Kkobuki {
	
	//������
	public Kkobuki(int l, char t) {
		this.level = l;
		this.type = t;
	}
	
	//������
	private final String name = "������";
	private int level;
	private char type;
	
	//�޼ҵ�
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public char getType() {
		return this.type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	//�����ġ��
	public void bodyAttack() {
		System.out.println("������ ���� ��ġ�� !!!");
	}
	
	//������
	public void waterCanon() {
		System.out.println("������ ~!~~");
	}
	
	//��ǰ����
	public void bubble() {
		System.out.println("��ǰ���� ~!~!~!");
	}
	

}
