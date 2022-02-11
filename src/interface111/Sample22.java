package interface111;

public class Sample22 implements Sample11{

	public void display()
	{
		System.out.println("abstract method");
	}
	public void add()
	{
		System.out.println("add method");
	}
	
	public void sum()
	{
		System.out.println("child class method");
	}
	public static void main(String[] args) {

		Sample22 obj=new Sample22();
		obj.display();
		obj.add();
		obj.sum();
		
System.out.println(a);
System.out.println(obj.b);
	}

}
