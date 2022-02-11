package exceptionexample;

public class  TryFinally{

	public void display()
	{
		 int a=10;
		
		 try 
		 {                        
		 int b=a/0;
		 System.out.println(b);
		 System.out.println("try block");	
		 }
		 
		finally 
		{
			System.out.println("finally block");	
		}
		 
		 
	}
		public static void main(String[] args) {
			TryFinally obj=new TryFinally();
			System.out.println("end of statement");
			obj.display();
			
		}
}
