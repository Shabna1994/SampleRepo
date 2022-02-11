
package encapsulatio;



public class Bank 
	{
  private int pin;
   
	public void setter(int pin)
	{
		this.pin=pin;
		if(pin==1001||pin==1234||pin==1212)
		   {
			   System.out.println("pin set");
		   }
		   else   
		   {
			   System.out.println("in valid");
		   }	
	}
	public void getter()
	{
		
		System.out.println("your pin is :" +pin);
	}
	}