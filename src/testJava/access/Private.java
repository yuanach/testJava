package testJava.access;


public class Private {
	

	private int access; 	//内部访问
	int access1; 	// 默认为包访问权限
	
	//###### 实现单例(Singleton)设计模式  ######
	private static Private ps1=new Private();
	public static Private makeSingleton(){
		return ps1;
	}
	//#######
	
	//private修饰构造函数，这样只能在本类中创建对象
	private Private(){
		
	}

	public  Private makePrivate(){
		System.out.println("Private Constructor.");
		return new Private();
	}
	
	//外部可通过静态函数来获得此类的实例对象
	public  static Private makePrivateByStatic(){
		return new Private();
	}
}


//用private修饰内部类
class PrivateInnerClass{
	private class Inner{
		
	}
}

/*
 * 	由于Private类没有可见的构造器，那么就不能从Private进行继承
 * 		class SubPrivate extends Private{
 *
 *		}
 */

