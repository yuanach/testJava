package testJava.lang.Exception;

public class BaseStatsment {
	
	public static String testException(boolean b){
		try{
			System.out.println("excute try");
			if(b){
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("execute e");
		}finally{
			System.out.println("execute finally");
	}
		
		return "Return from Method";  //���۷����쳣���,return��䶼��ִ��
	}
	
	public static void main(String[] args) {
		String s=testException(true);
		System.out.println(s);
		
//		excute try
//		execute e
//		execute finally
//		Return from Method
	}
}
