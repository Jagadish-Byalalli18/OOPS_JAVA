package Interfaces_;

public class Ppay implements ProcessPayment{

	@Override
	public void payment(int amount) {
		System.out.println("payment through Ppay is "+amount);
	}

}
