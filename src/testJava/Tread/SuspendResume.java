package testJava.Tread;

class NewThread implements Runnable{
	private String name;
	Thread t;
	private boolean isSuspend;
	NewThread(String tName){
		name=tName;
		t=new Thread(this,tName);
		 isSuspend=false;
		t.start();
	}
	void suspend(){
		isSuspend=true;
	}
	
	//为什么resume要用synchronized修饰，而suspend不用
	synchronized void resume(){  
		isSuspend=false;
		notify();
	}
	@Override
	public void run() {
		try {
			for(int i = 15; i > 0; i--) { 
				System.out.println(name + ": " + i); 
				Thread.sleep(200); 
				synchronized(this) { 
					while(isSuspend) { 
						wait(); 
					} 
				} 
			} 
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
	
}
public class SuspendResume {

	public static void main(String[] args) {
		NewThread t1=new NewThread("One");
		NewThread t2=new NewThread("Two");
		
		try {
			Thread.sleep(1000);
			t1.suspend();
			System.out.println(t1.t.getName() + " Suspend"); 
			Thread.sleep(1000);
			t2.suspend();
			System.out.println(t2.t.getName() + " Suspend"); 
			//Thread.sleep(1000);
			//t2.resume();
			Thread.sleep(1000);
			t1.resume();
			System.out.println(t1.t.getName() + " Resume"); 
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		try {
			t1.t.join();
			t2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
