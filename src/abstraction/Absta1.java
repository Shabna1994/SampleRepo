package abstraction;

public class Absta1 extends Absta {

	public void print()
	{
		System.out.println("this is a abstract method");
	}
	public static void main(String[] args) {
		Absta1 obj=new Absta1();
		
		obj.display();
		obj.print();
	}

}
