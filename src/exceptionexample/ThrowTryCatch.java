//handle exception with try catch throw methods
package exceptionexample;

public class ThrowTryCatch {

	public static void throwexample(int age)  throws ArithemeticException {
		if(age<18) 
		{
			throw new ArithemeticException();   //throw exception
		}
		else {
				System.out.println("eligible for vote");
			}
		
	}
	public static void main(String[] args) throws ArithemeticException 
	{
	
		
		try 	{                                            //try

				throwexample(14);
				}
		
		catch (Exception e)
		{
			System.out.println("Exception handiled");
			System.out.println(e);
		}
	
		/*finally {
				System.out.println("rest of the code");
				}  */

	}

}
