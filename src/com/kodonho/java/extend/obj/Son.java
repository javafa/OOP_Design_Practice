package com.kodonho.java.extend.obj;

public class Son extends Father{
	public String wife;
	public String girlfriend;
	
	@Override
	public void process9(){

	}
	
	public void process9(int aaa){
		
	}
	
	public void process9(String a){
		
	}
	
	public void process9(int a, String b){
		
	}
	
	@Override
	public void goDestination() {
		super.process9(); // �ƺ���
		process9(); // ����
		
		// �������� �ۼ�
	}
	
	
}
