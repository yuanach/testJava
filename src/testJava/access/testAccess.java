package testJava.access;

public class testAccess {

	public static void main(String[] args) {
		Private p=Private.makePrivateByStatic();
		
		//默认为包访问权限
		p.access1=0xabcd;

	}

}
