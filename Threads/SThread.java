package Threads;



class thread extends Thread {
	private String task;
	
	thread(String task){
		this.task=task;
		
	}
	
	public void run() {
		System.out.println(task+Thread.currentThread().getName());
		
		}
}
public class SThread {
	
	public static void main(String[]args) {
		thread t=new thread("pasta");
		thread t1=new thread("pizza");
		thread t2=new thread("dose");
		thread t3=new thread("rice");
		thread t4=new thread("samber");
		thread t5=new thread("idly");
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		t5.start();
		
	}

}
