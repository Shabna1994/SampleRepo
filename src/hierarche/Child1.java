package hierarche;

public class Child1 extends Parent {
	
	public void sub()
	{
		int sub1=a-b;
		
		System.out.println("Sub : "+sub1);
	}

	public static void main(String[] args) {
		
		Child1 obj=new Child1();
		obj.sum();
		obj.sub();
	}

}
