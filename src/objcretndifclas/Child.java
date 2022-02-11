package objcretndifclas;

public class Child extends Parent {
	public void print()
	{
		System.out.println("Car color is red(child)");
	}
	public static void main(String[] args) {
		
		Child obj =new Child();
		obj.print();
		Parent obj1=new Parent();
		obj1.print();
		
	}

}
