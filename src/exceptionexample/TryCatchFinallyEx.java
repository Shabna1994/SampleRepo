package exceptionexample;

public class TryCatchFinallyEx {
	public void display()
	{
		int a=10;
		
		try {                        
		 int b=a/0;
		 System.out.println(b); 
		 System.out.println("try block");	
		 
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("catch block");
		}
		
		finally 
		{
			 System.out.println("finally block");	
		}
		
	}
		public static void main(String[] args) {
			TryCatchFinallyEx obj=new TryCatchFinallyEx();
			obj.display();
			System.out.println("end of statement");
}
		}

