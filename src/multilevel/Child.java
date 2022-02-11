package multilevel;

public class Child extends Parent {
	public void mul()
	{
	int mul=a*b;
	System.out.println("Mul : "+mul);
	}
	public static void main(String[] args) {
	Child obj=new Child();
	obj.sum();
	obj.sub();
	obj.mul();

	}

}
