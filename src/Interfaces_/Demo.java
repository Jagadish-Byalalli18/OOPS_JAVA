package Interfaces_;

public class Demo {
public static void main(String[] args) {
	
	Ppay g=new Ppay();
	
	
	PaymentService p1=new PaymentService(g);
	
	p1.display(100);

}
}
