package testJava.Tread;

class Q{
	public static final int MAX_QUEUE_LEN=10;
	private boolean isEmpty=true;
	private boolean isFill=false;
	private int pCount=0;

	synchronized void put(){
		if(!isEmpty)
			try {			
				wait();  //等待直到isEmpty为true, 当isEmpty为true时，其他线程会调用notify()通知此线程
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			pCount++;
			if(pCount == MAX_QUEUE_LEN){
				isEmpty=false;
			}
			System.out.println("Put: "+pCount);
			isFill=true;		
			notify();
	}
	
	synchronized void get(){
		if(!isFill)
			try {
				wait(); //等待直到isFill为true
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pCount--;
			if(pCount == 0)
				isFill=false;
			System.out.println("Get and"+pCount+" remains");
			isEmpty=true;
			notify();	
	}
	
}

class Producer implements Runnable{
	Q q;

	Producer(Q q){
		this.q=q;
		new Thread(this,"Producer").start();
	}
	@Override
	public void run() {
		while(true){
			q.put();
		}	
	}
}

class Consumer implements Runnable{
	Q q;
	
	Consumer(Q q){
		this.q=q;
		new Thread(this,"Comsumer").start();
	}
	
	@Override
	public void run() {
		while(true){
			q.get();
		}	
	}
	
}
public class PC {

	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Begin");
	}

}
