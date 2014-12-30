/*
 *  @Date 2014-09-07
 */
package testJava.Tread;

//被调用的资源，无同步机制，与有同步机制（管程）
class Callme{
	
	/*
	 * 此方法被调用者抢着调用，发生冲突，没有进行同步设置，导致不可预知的混合输出
	 * 可在调用者中使用synchronized关键字修饰相关语句（临界区）或使用synchronized修饰函数
	 */
	void call(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.print("]");
	}
	
	/*
	 * 	此方法用synchronized关键字修饰，添加管程，实现同步访问，防止混乱访问
	 */
	synchronized void synCall(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.print("]");
	}
}

//调用类型，创建线程进行并发访问
class Caller implements Runnable{

	String msg;
	Callme target;
	Thread t;
	Caller(Callme tg,String s){
		msg=s;
		target=tg;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		//target.call(msg);
		//target.synCall(msg);
		//synchronized block，Critical Area
		synchronized(target){
			target.call(msg);
		}
	}
	
}

//创建多个线程，进行并发访问
public class Synch {

	public static void main(String[] args) {
		Callme call=new Callme();
		Caller c1=new Caller(call,"One");
		Caller c2=new Caller(call,"Two");
		Caller c3=new Caller(call,"Three");
		
		try{
			c1.t.join();
			c2.t.join();
			c3.t.join();
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}

	}

}
