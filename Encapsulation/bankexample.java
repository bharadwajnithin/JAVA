package Encapsulation;


class bank{
	private int balance;
	private String name;
	
	
	public  void setDe(String name,int balance){
		this.name=name;
		
		this.balance=balance;
		
		
	}
	
	public void getde() {
		System.out.println("name:"+name);
		if (balance>0) {
		System.out.println("blancec:"+balance);}
		else {
			System.out.println("blance:invalid !!!");}
		
	}
	

	
	
}
public class bankexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank o=new bank();
		o.setDe("nithin",111);
		
		o.getde();
		

	}

}
