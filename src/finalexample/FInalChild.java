package finalexample;

public class FInalChild extends FinalParent {

	public final  int x=20;
	public void  add(int a,int b)
	{
	
		int c=a+b;
		System.out.println("Addition :"+c);
		
	}
	public static void main(String[] args) {
		FInalChild obj=new FInalChild();
		obj.add(20,40);
	}

}
