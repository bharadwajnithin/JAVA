package Abstraction;


class TVR extends TV1
{

	@Override
	void ton() {
		
		System.out.println("tv turn on ");
		// TODO Auto-generated method stub
		
	}

	@Override
	void toff() {
		// TODO Auto-generated method stub
		System.out.println("tv turn iff ");
	}
	
}

public class TVremote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV1 v=new TVR();
		v.ton();
		v.toff();
		
		

	}

}
