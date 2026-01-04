package Enum;

class Order
{
	public OrderStatus  status;
	public int id;
	
	Order(OrderStatus  status, int id)
	{
		this.id=id;
		this.status=status;
	}
	
	public void OrderStatus()
	{
		System.out.println("the order "+ this.id +" is " + this.status );
	}
	
	public void UpadteStatus(OrderStatus  status)
	{
		this.status=status;
	}
	
	
}
public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		Order o = new Order(OrderStatus.PLACED, 101);
		o.OrderStatus();
		
		o.UpadteStatus(OrderStatus.SHIPPED);
		o.OrderStatus();
		
		o.UpadteStatus(OrderStatus.DELIVERED);
		o.OrderStatus();
		

		
		
	}

}
