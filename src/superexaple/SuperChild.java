package superexaple;

public class SuperChild extends Super1{

	public void print()
	{
		super.display();
		System.out.println("THIS IS A CHILD CLASS");
	}
	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.print();

	}

}
