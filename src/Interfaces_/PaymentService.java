package Interfaces_;

public class PaymentService {

	public ProcessPayment processpayment;
	
	PaymentService(ProcessPayment processpayment)
	{
		this.processpayment=processpayment;
	}
	
	public void display(int amount)
	{
		processpayment.payment(amount);
	}
}
