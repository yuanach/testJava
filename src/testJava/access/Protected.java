package testJava.access;

import testJava.B;

class Access{
	protected int access;
}

//�򡢷����̳пɷ���
class AccessE extends B{
	AccessE() {
		//�ǰ��ڼ̳пɼ�access
		super(0xcccc);
	}
	int getAccess(){
		
		//�ǰ��ڼ̳пɼ�access
		return access;
	}
}

//��protected�����ڲ���
class ProtectedInnerClass{
	protected class Inner{
		
	}
}

public class Protected {
	
	public static void main(String[] args) {
		Access a1=new Access();
		//���뵥Ԫ�ڿɼ�
		a1.access=0xffff; 
		System.out.println(a1.access);
		
		//���ڿɼ�
		A a2=new A();
		a2.access=0xeeee;
		System.out.println(a2.access);
		
		//�ǰ��ڲ��ɼ�
		B a3=new B();
		//a3.access=0xdddd;
		
		
		//�ǰ��ڼ̳пɼ������̳в��ɼ�
		AccessE a4=new AccessE();
		System.out.println(a4.getAccess());
	}

}
