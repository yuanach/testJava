package testJava.Tread;

class Resource{
	public int count=0;
	public void count(){
		count++;
	}
}
class Call implements Runnable{

	Thread t;
	Resource r;
	
	Call(String name,int pr){
		t=new Thread(this,name);
		t.setPriority(pr);
		r=new Resource();
		t.start();
	}
	
	@Override
	public void run() {
		int i;
		for(i=0;i<10000;i++)
			synchronized(r){
				r.count();
			}
	}
}
public class IPriority {

	public static void main(String[] args) {
		Call c1=new Call("One",10);
		Call c2=new Call("Two",5);
		
		try{
			//Thread.sleep(1000);
			c1.t.join();
			c2.t.join();
		}catch(InterruptedException e){
			System.out.println("InterruptedException caught"); 
		}
		System.out.println("One:"+c1.r.count);
		System.out.println("Two:"+c2.r.count);
	}

}
