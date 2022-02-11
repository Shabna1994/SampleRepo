/*interface support multiple inheritance(class-->Interface1,Interface2).
 * object of class is created.
 *interface method definition is given in class
 * 
 */
package multiplaeinheritance111;

public class Sample1  implements SampleInter2,SampleInter1 {

	public void display()
	{
		
		System.out.println("Interface 1");
	}
	public void add()
	{
		
		System.out.println("Interface 2");
	}
	
	public static void main(String[] args) {
		
		Sample1 obj=new Sample1();
		obj.display();
		obj.add();
		
	}

}
