/*encapsulation:
 
 */
package encapsul;

public class Sample1 {

	private String name;	//instance variables must be private
	private int age;
	
	public void setter(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
	public void getter()
	{
		System.out.println("NAME:"+name);
		age=age*2;
		System.out.println("AGE:"+age);
	}
}
