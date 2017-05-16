package com.kodonho.java.extend.obj;

public abstract class Fix {
	// �߻� Ŭ������ Ư¡
	// 1. �������̽��� �����ѵ�
	// 2. �������̽� + Ŭ����
	
	public void process(){
		disassemble();
		for(int i=0;i<3;i++){
			replacePart(); // �׻� ������ ��ü
		}
		runLogic();
		clean();
		assemble();
	}
	
	private void runLogic(){
		// �� ������ �ٲ�� �ȵǰ� ���������θ� ��ߵ�...
	}
	
	public abstract void disassemble();
	
	public abstract void replacePart();
	
	public abstract void clean();
	
	public abstract void assemble();
	
}