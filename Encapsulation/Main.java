package Encapsulation;



class my{
	
	private int id ;
	
	private String name;
	
	public void setde(int id, String name) {
		
		this.id=id;
		this.name=name;
		
	}
	
	public void getde1() {
		System.out.println("this is "+id+name);
		
	}
		
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		my ob=new my();
		
		ob.setde(1, "Nithin");		
		
		
		ob.getde1();
		ob.setde(2, "Dhurgi");
		
		ob.getde1();
		
		
		
		
	}

}
