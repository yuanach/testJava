package testJava.String;

public class TestStringBuffer {

	/**
	 * StringBuffer���̰߳�ȫ��, J2SE 5 ������StringBuilder,���Ƿ��̰߳�ȫ�ģ��������ٶȽϿ�
	 * 
	 */
	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer();
		StringBuilder builder=new StringBuilder();
		
		builder.append(true).append(buffer);
		
		System.out.println(builder.length());
		
	}
}
