package testJava.String;

public class TestStringBuffer {

	/**
	 * StringBuffer是线程安全的, J2SE 5 引入了StringBuilder,它是非线程安全的，但处理速度较快
	 * 
	 */
	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer();
		StringBuilder builder=new StringBuilder();
		
		builder.append(true).append(buffer);
		
		System.out.println(builder.length());
		
	}
}
