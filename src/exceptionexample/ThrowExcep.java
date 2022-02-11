//throw exception --->try , finally example
package exceptionexample;

public class ThrowExcep 
{

	public static void throwexample(int age)  throws ArithemeticException {
		if(age<18) 
		{
		
			throw new ArithmeticException("Person is not eligible to vote");       //throw exception
		}
		else {
				System.out.println("eligible for vote");
			}
		
	}
	public static void main(String[] args) throws ArithemeticException 
	{
	
		
try 	{                                            //try
	throwexample(12);
	System.out.println("try blick");
			}
	
	finally {
				System.out.println("rest of the code");
			}  

	}
	

}
