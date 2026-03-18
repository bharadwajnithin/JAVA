package Abstraction;




class red extends TF{
	void red() {
		System.out.println("I F red ligh on stoppp");
	}

	@Override
	void yellow() {
		// TODO Auto-generated method stub
		System.out.println("If yessl light ready yy");
	}

	@Override
	void green() {
		// TODO Auto-generated method stub
		System.out.println("if greeen is gooo ooo");
		
	}
}
public class Tlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 red ob=new red()
;
		 ob.red();
		 ob.yellow();
	

	}

}
