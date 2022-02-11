//arithmetic exception
package exceptionexample;

public class TryCatchExml {
public void display()
{
	 int a=10;
	 
	try 
	{                        
	 int b=a/0;
	 System.out.println(b);
	}
	
	catch(Exception c) 
	{
	System.out.println("Exception handl");
	System.out.println(c);
	}
	

}
	public static void main(String[] args) {
		TryCatchExml obj=new TryCatchExml();
		//System.out.println("end of statement");//print statement .bcoz the print  is after the exception
		obj.display();
		System.out.println("end of statement");//not print statement .bcoz the print  is before  the exception
	}

}
