package Interview;

/**
 * 方法区、堆区、栈区
 *
 */
public class Crux6 {
	public static void main(String[] args){
//		final StringBuffer sb=new StringBuffer();
//		sb.append("I am ");
//		sb.append("Yuanach.");
		//sb = new StringBuffer();
		String s="string";
		String s1=new String("string");
		String s2=new String("string");
		String s3="str"+"ing";
		String s4=new String("str")+new String("ing");
		System.out.println(s == s1);
		System.out.println(s1 == s2);
		
		String s5=new String("string");
//		a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings.
		String s6=s5.intern();
		System.out.println(s == s6);
//		StringBuffer sb1=new StringBuffer("sb");
//		StringBuffer sb2=new StringBuffer("sb");
//		StringBuffer sb1=new StringBuffer("sb");
//		StringBuffer sb2=new StringBuffer("sb");
//		System.out.println(sb1 == sb2);
	}
}
