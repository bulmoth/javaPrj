package com.kh.main;

public class Pikachu {
	
	//�����ڰ� �ƹ��͵� ������, JVM�� �⺻ �����ڸ� �������
	
//	//������0
//	public Pikachu() {
//		
//	}
	
	//������1
	public Pikachu(int x, char ch) {
		this.level =x;
		this.type = ch;	//E == ����Ÿ��
	}
	
//	//������2
//	public Pikachu(int num, char ch, String msg) {
//		this.level = num;
//		this.type = ch;
//		System.out.println(msg);
//	}
	
	//������
	private final String name = "��ī��";
	private int level;	//����
	private char type;	//E, W, F Ÿ��(����, ��, ��)
	
	
	//����(�޼ҵ�)
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
			System.out.println("��ī�� ���� ��ġ�� ~~!~~!~");
		}
	
	//�鸸��Ʈ
	public void millionVolt() {
		System.out.println("�鸸��Ʈ ~~~!~~!~");
	}
	
	//�����Ʈ
	public void thunderVolt() {
		System.out.println("�����Ʈ ~~!~!~");
	}
	
	

}
