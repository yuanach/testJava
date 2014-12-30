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
		
		//Java����ʱ����һ��������
//		System.out.println(ClassA.class.hashCode()+"##"+ca.getMethod("getString",ca));
//		System.out.println(a.string_ns.hashCode() == b.string_ns.hashCode());
		System.out.println(a.getSuper().hashCode());//������Ĵ��뵫���������ʵ����
		
//		System.out.println(ClassB.class.hashCode()+"##"+cb.getMethod("getString",cb));
//		System.out.println(ClassA.string_s.hashCode() == ClassB.string_s.hashCode());
		System.out.println(b.getSuper().hashCode());

	}
}
