package Basics;

class Animal
{
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	Animal(String Name)
	{
		this.name=Name;
	}
	
	public String name ;
	
	public void display()
	{
		System.out.println("the animal is "+ name);
	}
}


public class Demo {
	
public static void main(String[] args) {
	
	Animal a1=new Animal("Lion");
	a1.display();
	
	Animal a2=new Animal();
	a2.name="Tiger";
	a2.display();
}
}
