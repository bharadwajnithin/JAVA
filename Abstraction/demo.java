package Abstraction;

interface A{
	void show();
}
interface B{
	void display();
	
}

class demo implements A,B{


@Override
public void display() {
	System.out.println("is a display ");
	// TODO Auto-generated method stub
	
}

@Override
public void show() {
	// TODO Auto-generated method stub
	System.out.println("its showw ");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		A d=new demo();
		d.show();
		B dd=new demo();
		
		dd.display();
		



}}
