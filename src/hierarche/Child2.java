package hierarche;

public class Child2 extends Child1 {

	public void mul()
	{
		
	int mul=a*b;
	System.out.println("Mul : "+mul);
	}
	public static void main(String[] args) {
		
		Child2 obj=new Child2();
		obj.sum();
		obj.mul();
	}

}
