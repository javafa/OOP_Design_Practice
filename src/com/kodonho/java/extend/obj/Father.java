package com.kodonho.java.extend.obj;

public class Father extends Fix implements Cook {
	public String lastname;
	public String name;
	
	public int age;
	public int money;
	public String house;
	public String car;
	public String wife;
	
	public void process9(){
		process();
	}
	
	public void goDestination(){
		
		process9();
		
		System.out.println("9���� ���");
	}

	@Override
	public void boil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oven() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void steam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disassemble() {
		System.out.println("�����Ͽ����ϴ�");
		
	}

	@Override
	public void replacePart() {
		System.out.println("��ü�Ͽ����ϴ�");
	}

	@Override
	public void clean() {
		System.out.println("û���Ͽ����ϴ�");
	}

	@Override
	public void assemble() {
		System.out.println("�����Ϸ�");
	}
}