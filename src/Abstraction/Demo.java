package Abstraction;

interface Pay{
	public void payment(int amount);
}

class Gpay implements Pay
{

	@Override
	public void payment(int amount) {
		System.out.println("payemnt through gpay "+ amount);
		
	}
	
}

class Ppay implements Pay
{

	@Override
	public void payment(int amount) {
		System.out.println("payemnt through ppay "+ amount);
		
	}
	
}

public class Demo {
public static void main(String[] args) {
	
	Pay g=new Gpay();
	g.payment(100);
	
}
}
