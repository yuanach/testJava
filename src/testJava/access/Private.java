package testJava.access;


public class Private {
	

	private int access; 	//�ڲ�����
	int access1; 	// Ĭ��Ϊ������Ȩ��
	
	//###### ʵ�ֵ���(Singleton)���ģʽ  ######
	private static Private ps1=new Private();
	public static Private makeSingleton(){
		return ps1;
	}
	//#######
	
	//private���ι��캯��������ֻ���ڱ����д�������
	private Private(){
		
	}

	public  Private makePrivate(){
		System.out.println("Private Constructor.");
		return new Private();
	}
	
	//�ⲿ��ͨ����̬��������ô����ʵ������
	public  static Private makePrivateByStatic(){
		return new Private();
	}
}


//��private�����ڲ���
class PrivateInnerClass{
	private class Inner{
		
	}
}

/*
 * 	����Private��û�пɼ��Ĺ���������ô�Ͳ��ܴ�Private���м̳�
 * 		class SubPrivate extends Private{
 *
 *		}
 */

