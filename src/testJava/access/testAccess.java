package testJava.access;

public class testAccess {

	public static void main(String[] args) {
		Private p=Private.makePrivateByStatic();
		
		//Ĭ��Ϊ������Ȩ��
		p.access1=0xabcd;

	}

}
