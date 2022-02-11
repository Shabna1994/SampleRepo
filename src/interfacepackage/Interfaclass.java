package interfacepackage;

public class Interfaclass implements InterfSample {

	public void display()
	{
		
		System.out.println("abstract method");
	}
	public void add()
	{
		
		int z=a+b;
		System.out.println("Sum : "+z);
	}
	
	public void childmethod()
	{
		int c=b-a;
		System.out.println("Diff : "+c);
		System.out.println("child method");
		
		
	}
	public static void main(String[] args) {
		Interfaclass obj=new Interfaclass();
		obj.display();
		obj.add();
		obj.childmethod();
		
System.out.println("a : "+a);
System.out.println("b : "+obj.b);
		
		
		/*InterfSample obj=new Interfaclass();
		obj.display();
		obj.add();
		
		
System.out.println("a : "+a);
System.out.println("b : "+obj.b);
*/
		
	}

}
