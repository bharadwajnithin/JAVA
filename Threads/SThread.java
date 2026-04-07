package Threads;



class cooking extends Thread {
	private String task;
	
	cooking(String task){
		this.task=task;
		
	}
	
	public void run() {
		System.out.println(task+Thread.currentThread().getName());
		
		}
}
public class SThread {
	
	public static void main(String[]args) {
		cooking t=new cooking("pasta");
		cooking t1=new cooking("pizza");
		cooking t2=new cooking("dose");
		cooking t3=new cooking("rice");
		cooking t4=new cooking("samber");
		cooking t5=new cooking("idly");
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		t5.start();
		
	}

}
