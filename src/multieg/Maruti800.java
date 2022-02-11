package multieg;

public class Maruti800 extends Maruti 
{
	public void display2()
	{
		System.out.println("Model:800");
	}
	public void print2()
	{
		System.out.println("Max speed:80km/hr");
	}
	
	public static void main(String[] args) {
		
		Maruti800 obj=new Maruti800();
		//obj.display();
		obj.print();
		
		Maruti800 obj1=new Maruti800();
		obj1.display1();
		obj1.print1();
		
		Maruti800 obj2=new Maruti800();
		obj2.display2();
		obj2.print2();
		

	}

}
