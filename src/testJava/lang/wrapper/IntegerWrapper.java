package testJava.lang.wrapper;

public class IntegerWrapper {

	public static void main(String[] args) {
		
		Integer a=0x111; //�Զ�װ��
		int b=a;
		int c=new Integer(a); //�Զ�����
		
		
		Integer a1=1234;
		Integer a2=1234;
		System.out.println(a1 == a2);

//		�������⣬��[-128,128]֮���ֵ�Զ���Ϊ��������
		Integer b1=127;
		Integer b2=127;
		System.out.println(b1 == b2);
	
	}

}
