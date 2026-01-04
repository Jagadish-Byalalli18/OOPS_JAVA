package Interfaces_;

public class Gpay implements ProcessPayment {

	@Override
	public void payment(int amount) {
		System.out.println("payment through gpay is "+amount);
		
	}
	

}
