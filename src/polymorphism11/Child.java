/*same method name but parent method body is override and print 
child method body only.ppty of parent class is obtained by super 
keyword*/ 

package polymorphism11;

public class Child extends Parent {

	@Override
public void display()
	
	{
	//super.display();
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();

	}

}
