package testJava.access;

import testJava.B;

class Access{
	protected int access;
}

//域、方法继承可访问
class AccessE extends B{
	AccessE() {
		//非包内继承可见access
		super(0xcccc);
	}
	int getAccess(){
		
		//非包内继承可见access
		return access;
	}
}

//用protected修饰内部类
class ProtectedInnerClass{
	protected class Inner{
		
	}
}

public class Protected {
	
	public static void main(String[] args) {
		Access a1=new Access();
		//编译单元内可见
		a1.access=0xffff; 
		System.out.println(a1.access);
		
		//包内可见
		A a2=new A();
		a2.access=0xeeee;
		System.out.println(a2.access);
		
		//非包内不可见
		B a3=new B();
		//a3.access=0xdddd;
		
		
		//非包内继承可见，不继承不可见
		AccessE a4=new AccessE();
		System.out.println(a4.getAccess());
	}

}
