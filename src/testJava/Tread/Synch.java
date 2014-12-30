/*
 *  @Date 2014-09-07
 */
package testJava.Tread;

//�����õ���Դ����ͬ�����ƣ�����ͬ�����ƣ��̣ܳ�
class Callme{
	
	/*
	 * �˷��������������ŵ��ã�������ͻ��û�н���ͬ�����ã����²���Ԥ֪�Ļ�����
	 * ���ڵ�������ʹ��synchronized�ؼ������������䣨�ٽ�������ʹ��synchronized���κ���
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
	 * 	�˷�����synchronized�ؼ������Σ���ӹ̣ܳ�ʵ��ͬ�����ʣ���ֹ���ҷ���
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

//�������ͣ������߳̽��в�������
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
		//synchronized block��Critical Area
		synchronized(target){
			target.call(msg);
		}
	}
	
}

//��������̣߳����в�������
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
