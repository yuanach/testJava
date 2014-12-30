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
		
		return "Return from Method";  //无论发生异常与否,return语句都会执行
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
