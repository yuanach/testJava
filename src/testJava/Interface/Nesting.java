package testJava.Interface;

public class Nesting implements A, A.A1,B.B1{

	@Override
	public void f1() {}  //�����ͬ�ӿ��еķ�����ȫ��ͬ����û���κ�����

	//@Override
	//public int f2() {} 		//�����ͬ�ӿ�������ͬ���ֵķ�����ֻ�з���ֵ��ͬ����ô�����ִ���

}

interface A{
	//Ĭ��Ϊpublic
	interface A1{
		//Ĭ��public
		void f1();
		//int f2();
	}
	
	public interface A2{
		
	}
	
	//!-- ��������Ϊprivate
	//private interface A3 
}

class B{
	interface B1{
		void f1();
		//float f2();
	}
	
	private interface B2{
		void f2();
	}
}