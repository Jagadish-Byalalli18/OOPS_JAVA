package Inheritance;

class Engine
{
	public void start()
	{
	 System.out.println("engine started");	
	}
	
	public void stop()
	{
	 System.out.println("engine stoped");	
	}
}

class ElictricEngine extends Engine
{
	public void charge()
	{
		System.out.println("electric engine charged");
	}
}


class GasEngine extends Engine
{
	public void filltank()
	{
		System.out.println("tank filled");
	}
}

public class Demo {
public static void main(String[] args) {
	ElictricEngine e=new ElictricEngine();
	e.start();
	e.charge();
	e.stop();
	
	System.out.println();
	
	GasEngine g=new GasEngine();
	g.start();
	g.filltank();
	g.stop();
	
}
}
