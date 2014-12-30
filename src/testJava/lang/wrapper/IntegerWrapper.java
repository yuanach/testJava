package testJava.lang.wrapper;

public class IntegerWrapper {

	public static void main(String[] args) {
		
		Integer a=0x111; //自动装箱
		int b=a;
		int c=new Integer(a); //自动拆箱
		
		
		Integer a1=1234;
		Integer a2=1234;
		System.out.println(a1 == a2);

//		缓冲问题，在[-128,128]之间的值自动视为基础类型
		Integer b1=127;
		Integer b2=127;
		System.out.println(b1 == b2);
	
	}

}
