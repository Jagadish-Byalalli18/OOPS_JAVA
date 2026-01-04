package Encapsulation;

class Student
{
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if(marks>0 && marks<=100)
		{
			this.marks = marks;
		}
		
	}
	
}
public class Demo {
	public static void main(String[] args) {
		Student s=new Student();
		s.setMarks(100);
		//s.marks=100;  compilation error
	    System.out.println("marks is "+ s.getMarks());
		
		
	}

}
