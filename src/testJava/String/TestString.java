package testJava.String;

/**
 * 字符串放在内存方法区的常量池中
 * @author Administrator
 *
 */



public class TestString {
	public static void main(String[] args) {
		String s="abs";
		
		StringBuffer sb=new StringBuffer();
		
		Integer ii=1;
		int h=0;
		char var[]=s.toCharArray();
		for (int i = 0; i < var.length; i++) {
			h=31*h+var[i];
		}
		
		
		System.out.println("h="+h+"\n"+"hashcode="+s.hashCode());
	}
}
