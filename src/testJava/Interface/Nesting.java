package testJava.Interface;

public class Nesting implements A, A.A1,B.B1{

	@Override
	public void f1() {}  //如果不同接口中的方法完全相同，则没有任何问题

	//@Override
	//public int f2() {} 		//如果不同接口中有相同名字的方法，只有返回值不同，那么则会出现错误

}

interface A{
	//默认为public
	interface A1{
		//默认public
		void f1();
		//int f2();
	}
	
	public interface A2{
		
	}
	
	//!-- 不能声明为private
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