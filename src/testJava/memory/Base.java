package testJava.memory;

class ClassS{
	public ClassS getSuper(){
		return this;
	}
}

class ClassA extends ClassS{
	static public String string_s="Test constant area STATIC";
	public String string_ns="Test constant area NON-STATIC";
	
	public String getString(){
		return string_s;
	}
}

class ClassB extends ClassS{
	static public String string_s="Test constant area STATIC";
	public String string_ns="Test constant area NON-STATIC";
	
	public String getString(){
		return string_s;
	}
	
	
}

public class Base {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		ClassA a=new ClassA();
		ClassB b= new ClassB();
		
		Class ca=ClassA.class;
		Class cb=ClassB.class;
		
		//Java运行时共用一个常量池
//		System.out.println(ClassA.class.hashCode()+"##"+ca.getMethod("getString",ca));
//		System.out.println(a.string_ns.hashCode() == b.string_ns.hashCode());
		System.out.println(a.getSuper().hashCode());//共享父类的代码但不共享对象（实例）
		
//		System.out.println(ClassB.class.hashCode()+"##"+cb.getMethod("getString",cb));
//		System.out.println(ClassA.string_s.hashCode() == ClassB.string_s.hashCode());
		System.out.println(b.getSuper().hashCode());

	}
}
